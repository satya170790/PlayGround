package speed.start.logical

class LongestPalindromeSubString {

    companion object {
        private var max: Int = 0
        private var start: Int = 0
        private var end: Int = 0

        // Expand Around Center Function
        private fun expandAroundCenter(s: String, left: Int, right: Int): Int {
            var leftIndex = left
            var rightIndex = right
            // Expand while the characters on both sides match
            while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] == s[rightIndex]) {
                leftIndex--
                rightIndex++
            }
            // Length of the palindrome
            return rightIndex - leftIndex - 1
        }

        fun longestPalindrome(s: String): String {
            if (s.isEmpty()) return ""

            for (i in s.indices) {
                // Check odd-length palindromes (single center)
                val len1 = expandAroundCenter(s, i, i)
                // Check even-length palindromes (two centers)
                val len2 = expandAroundCenter(s, i, i + 1)

                // Choose the maximum length between the two
                val len = maxOf(len1, len2)

                if (len > max) {
                    max = len
                    start = i - (len - 1) / 2
                    end = i + len / 2
                }
            }

            return s.substring(start, end + 1)
        }
    }
}
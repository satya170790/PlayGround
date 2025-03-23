package speed.start.logical

class LongestSubString {
    companion object {
        fun lengthOfLongestSubstring(s: String): Int {
            // Set to store unique characters in the current window
            val charSet = mutableSetOf<Char>()

            // Initialize the left pointer and the maximum length
            var left = 0
            var maxLen = 0

            // Traverse the string with the right pointer
            for (right in s.indices) {
                // If the character at right is already in the set, shrink the window
                while (charSet.contains(s[right])) {
                    charSet.remove(s[left])
                    left++
                }

                // Add the current character to the set
                charSet.add(s[right])

                // Update the maximum length of the substring
                maxLen = maxOf(maxLen, right - left + 1)
            }

            return maxLen
        }
    }
}
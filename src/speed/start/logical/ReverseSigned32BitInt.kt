package speed.start.logical

class ReverseSigned32BitInt {
    companion object {

        fun reverse(x: Int): Int {
            var reverseNum = 0
            var num = x
            while (num != 0) {
                val digit: Int = num % 10
                num /= 10
                // Check for overflow before performing the reversal
                if (reverseNum > Int.MAX_VALUE / 10 || (reverseNum == Int.MAX_VALUE / 10 && digit > 7)) {
                    return 0  // Overflow if the number exceeds the 32-bit signed integer max value
                }
                if (reverseNum < Int.MIN_VALUE / 10 || (reverseNum == Int.MIN_VALUE / 10 && digit < -8)) {
                    return 0  // Underflow if the number exceeds the 32-bit signed integer min value
                }
                reverseNum = reverseNum * 10 + digit
            }
            return reverseNum
        }
    }
}
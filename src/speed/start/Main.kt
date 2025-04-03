package speed.start

import speed.start.logical.LongestPalindromeSubString
import speed.start.logical.LongestSubString

fun main() {
    println("Hello World!")
   /* val len=LongestSubString.lengthOfLongestSubstring("abb")
    println("Substring length - $len")*/

    val lPS=LongestPalindromeSubString.longestPalindrome("KATAK")
    println("Substring length - $lPS")
}

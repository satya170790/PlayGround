package speed.start.logical

import java.util.ArrayList
import java.util.Vector

class ZigZagConversion {
    companion object{
        fun convert(s: String, numRows: Int): String {
            if (s.isEmpty() || numRows <= 0) {
                return ""
            }
            if (numRows == 1) {
                return s
            }

            val len: Int = s.length
            val zigzagList = ArrayList<String>(numRows) // Create a list of numRows empty strings
            for (i in 0..<numRows) {
                zigzagList.add("") // Initialize each row as an empty string
            }

            var pointer = 0
            var isPositiveDirection = true

            for (i in 0..<len) {
                // Add the current character to the appropriate row (pointer)
                zigzagList[pointer] += s[i]

                // Change direction when we hit the top or bottom row
                if (isPositiveDirection) {
                    if (pointer == numRows - 1) {
                        isPositiveDirection = false
                        pointer--  // Move up
                    } else {
                        pointer++  // Move down
                    }
                } else {
                    if (pointer == 0) {
                        isPositiveDirection = true
                        pointer++  // Move down
                    } else {
                        pointer--  // Move up
                    }
                }
            }

            // Concatenate all the rows to form the final zigzag string
            return zigzagList.joinToString("")
        }
    }

}
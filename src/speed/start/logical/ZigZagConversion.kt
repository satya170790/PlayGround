package speed.start.logical

class ZigZagConversion {
    fun convert(s: String, numRows: Int): String {
        if (s.isEmpty() || numRows <= 0) {
            return ""
        }
        if (numRows == 1) {
            return s
        }

        val result: StringBuilder = StringBuilder()
        val stepC: Int = 2 * numRows - 2  // This is the full cycle length

        // Loop through each row
        for (i in 0..<numRows) {
            // Loop through the string with the calculated step size
            var j = i
            while (j < s.length) {
                result.append(s[j])  // Add the character in the current row

                // If it's not the first or last row, we also need to add the diagonal character
                if (i != 0 && i != numRows - 1) {
                    val diagonalIndex = j + stepC - 2 * i
                    if (diagonalIndex < s.length) {
                        result.append(s[diagonalIndex])  // Add diagonal character
                    }
                }

                // Move to the next character in the current cycle
                j += stepC
            }
        }
        return result.toString()
    }

}
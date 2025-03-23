package speed.start.logical

class MedianOfArray {
    companion object {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val mergedArray = (nums1 + nums2).sorted()
            val len = mergedArray.size
            var median: Double = 0.0
            median = if (len % 2 == 0) {
                (mergedArray[(len / 2) - 1] + mergedArray[len / 2]) / 2.0
            } else {
                mergedArray[(len / 2)].toDouble()
            }
            return median
        }
    }
}
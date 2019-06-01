package andrew.solution

/**
 * @author Andrew Tse
 * @date 2019-06-01
 */

class SearchMatrix {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val intArray1: IntArray = intArrayOf(1, 4, 7, 11, 15)
            val intArray2: IntArray = intArrayOf(2, 5, 8, 12, 19)
            val intArray3: IntArray = intArrayOf(3, 6, 9, 16, 22)
            val intArray4: IntArray = intArrayOf(10, 13, 14, 17, 24)
            val intArray5: IntArray = intArrayOf(18, 21, 23, 26, 30)
            val matrix: Array<IntArray> = arrayOf(intArray1, intArray2, intArray3, intArray4, intArray5)

            println(searchMatrix(matrix, 5))
            println(searchMatrix(matrix, 20))
        }

        /**
         * 思路：
         *     由于数组每一行、每一列都是递增的，所以从第一行、最后一列开始查找。
         *     如果比target大，往左查找；比target小，往下查找；相等则直接返回true
         */
        private fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            when {
                matrix.isEmpty() -> return false
            }
            var i = 0
            var j: Int = matrix[0].size - 1

            while (i < matrix.size && j >= 0) {
                when {
                    matrix[i][j] > target -> j--
                    matrix[i][j] < target -> i++
                    else -> return true
                }
            }
            return false
        }
    }
}
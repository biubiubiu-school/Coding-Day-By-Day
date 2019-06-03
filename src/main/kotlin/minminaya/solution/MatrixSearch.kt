package minminaya.solution_20190601

val intArray1: IntArray = intArrayOf(1, 4, 7, 11, 15)
val intArray2: IntArray = intArrayOf(2, 5, 8, 12, 19)
val intArray3: IntArray = intArrayOf(3, 6, 9, 16, 22)
val intArray4: IntArray = intArrayOf(10, 13, 14, 17, 24)
val intArray5: IntArray = intArrayOf(18, 21, 23, 26, 30)

val sMatrix: Array<IntArray> = arrayOf(intArray1, intArray2, intArray3, intArray4, intArray5)

/**
 * 主要使用二分法，大体上确定行和列的范围（缩小范围），最后再根据行列范围倒序查找目标数字
 * 1、用第一行的中间的数字（二分中间点）去确定目标数字的列范围
 * 2、用第一列的中间的数字（二分中间点）去确定目标数字的行范围
 * 3、用缩小之后的行列进行倒序查找目标数字
 *
 * @param matrix 输入的二维数组
 * @param target 要寻找的数字
 * */
fun binarySearch(matrix: Array<IntArray>, target: Int): Boolean {
    val rowSize = matrix.size
    val colSize = matrix[0].size

    var rowStart = 0
    var colStart = 0
    var rowEnd = rowSize - 1
    var colEnd = colSize - 1

    loop@ while (rowStart <= rowEnd) {
        val mid = rowStart + (rowEnd - rowStart) / 2
        when {
            matrix[mid][0] > target -> rowEnd = mid - 1
            matrix[mid][0] == target -> return true
            mid == Int.MAX_VALUE -> break@loop
            else -> {
                rowStart = mid + 1
            }
        }
    }
    if (rowEnd < 0) rowEnd = 0

    loop@ while (colStart <= colEnd) {
        val mid = colStart + (colEnd - colStart) / 2
        when {
            matrix[0][mid] > target -> colEnd = mid - 1
            matrix[0][mid] == target -> return true
            mid == Int.MAX_VALUE -> break@loop
            else -> {
                colStart = mid + 1
            }
        }
    }

    if (colEnd < 0) colEnd = 0

    for (rowIndex in rowEnd downTo 0) {
        for (colIndex in colEnd downTo 0) {
            if (matrix[rowIndex][colIndex] == target) return true
        }
    }

    return false
}

fun main(args: Array<String>) {
    val result = binarySearch(sMatrix, 34)
    println("数组中有没有该结果呢，结果是：{$result}")
}
package andrew.solution

/**
 * @author Andrew Tse
 * @date 2019-06-04
 */
fun main(args: Array<String>) {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3
    merge(nums1, m, nums2, n)
    nums1.forEach { print("$it ") }
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m + n - 1
    var p1 = m - 1
    var p2 = n - 1
    while (p1 >= 0 && p2 >= 0) {
        nums1[i--] = if (nums1[p1] > nums2[p2]) nums1[p1--] else nums2[p2--]
    }

    while (p2 >= 0) {
        nums1[i--] = nums2[p2--]
    }
}
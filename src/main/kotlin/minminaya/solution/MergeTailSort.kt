package minminaya.solution

/**
 * 1、从尾部开始的归并排序
 * 2、从尾部开始，分别比较大小，大的放的nums1
 * 3、遍历结束后，如果num2还有数字，那么直接搬到nums1
 *
 * */
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

    var num1Index = m
    var num2Index = n
    while (num1Index > 0 && num2Index > 0) {
        if (nums1[num1Index - 1] >= nums2[num2Index - 1]) {
            nums1[num1Index + num2Index - 1] = nums1[num1Index - 1]
            num1Index -= 1
        } else {
            nums1[num1Index + num2Index - 1] = nums2[num2Index - 1]
            num2Index -= 1
        }
    }

    while (num2Index > 0) {
        nums1[num2Index--] = nums2[num2Index--]
    }
    nums1.forEach { print("$it ") }
}

fun main(args: Array<String>) {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3
    merge(nums1, m, nums2, n)

}
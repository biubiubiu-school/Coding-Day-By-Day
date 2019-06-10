package minminaya.solution.char

/**
 *  暴力移位
 *
 * */
fun leftShiftOne(str: CharArray, n: Int): CharArray {
    val firstChar = str[0]
    for (i in 1 until n) {
        str[i - 1] = str[i]
    }
    str[n - 1] = firstChar
    return str
}

/**
 * @param str 输入的字符串
 * @param total 字符串的长度
 * @param waitingMoveCount 需要移动的位数
 *
 * */
fun leftRotateStr(str: String, total: Int, waitingMoveCount: Int) {

    var waitingRemovedCountTemp: Int = waitingMoveCount
    var charArray = str.toCharArray()
    while (waitingRemovedCountTemp-- > 0) {
        charArray = leftShiftOne(charArray, total)
    }
    println(charArray)
}


fun main(args: Array<String>) {
    //方法1----时间复杂度为 O(m * n)，空间复杂度为 O(1)
    val str = "abcdef"
    leftRotateStr(str, str.length, 2)
}
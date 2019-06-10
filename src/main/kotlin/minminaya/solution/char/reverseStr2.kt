package minminaya.solution.char

/**
 *  反转字符串
 *  @param from 反转的起始点
 *  @param to 反转的终点
 * */
fun reverseStr(str: CharArray, from: Int, to: Int) {
    var varFrom = from
    var varTo = to
    while (varFrom < varTo) {
        val temp = str[varFrom]
        str[varFrom++] = str[varTo]
        str[varTo--] = temp
    }
}

/**
 * @param str 输入的字符串
 * @param total 字符串的长度
 * @param waitingMoveSize 需要移动的位数
 *
 * */
fun leftRotateStr(str: CharArray, total: Int, waitingMoveSize: Int) {
    var varWaitingMoveSize = waitingMoveSize
    varWaitingMoveSize %= total

    reverseStr(str, 0, varWaitingMoveSize - 1) //1、abcded-->bacdef
    reverseStr(str, varWaitingMoveSize, total - 1) // 2、bacdef-->bafedc
    reverseStr(str, 0, total - 1)// 3、bafedc -->cdefab
    println(str)
}


fun main(args: Array<String>) {
    //方法2----时间复杂度为 O(n)，空间复杂度为 O(1)
    //三步反转法
    val str = "abcdef"
    val chars = str.toCharArray()
    leftRotateStr(chars, chars.size, 2)
}
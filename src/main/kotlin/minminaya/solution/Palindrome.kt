package minminaya.solution

/**
 * 1、通过ASCII码过滤字母，转换为大小写一致的数字
 * 2、从中间向两边比较字母是否相等（类似的还可以从两边-->中间比较）
 *
 * */
fun isPalindrome(s: String): Boolean {

    val spiltStr = s.filter { (it.toInt() in 65..90) || (it.toInt() in 97..122) }.toUpperCase()
    println("去除空格后的str：$spiltStr")
    val middleIndex = spiltStr.length shr 1
    var index = 0
    while (middleIndex - index > 0) {
        if (spiltStr[middleIndex - index] != spiltStr[middleIndex + index]) {
            return false
        }
        index++
    }
    return true
}

fun main(args: Array<String>) {
    val a = "A man, a plan, a canal: Panama"
    val b = "race a car"
    println("是否是回文：" + isPalindrome(a))
    println("是否是回文：" + isPalindrome(b))
}
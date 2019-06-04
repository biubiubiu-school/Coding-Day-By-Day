package andrew.solution

/**
 * @author Andrew Tse
 * @date 2019-06-04
 */

fun main(args: Array<String>) {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {
    if (s.isEmpty()) {
        return true
    }
    var l = 0
    var r = s.length - 1

    while (l <= r) {
        if (s[l].isLetterOrDigit() && s[r].isLetterOrDigit()) {
            if (s[l].toLowerCase() != s[r].toLowerCase()) {
                return false
            } else {
                l++
                r--
            }
        } else if (!s[l].isLetterOrDigit()) {
            l++
        } else if (!s[r].isLetterOrDigit()) {
            r--
        }
    }
    return true
}
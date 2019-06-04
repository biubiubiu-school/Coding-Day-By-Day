package andrew.solution;

/**
 * @author Andrew Tse
 * @date 2019-06-04
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    private static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (Character.isLetterOrDigit(s.charAt(l)) && Character.isLetterOrDigit(s.charAt(r))) {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                } else {
                    l++;
                    r--;
                }
            } else if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
        }
        return true;
    }
}

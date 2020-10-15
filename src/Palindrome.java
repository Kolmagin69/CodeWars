public class Palindrome {

    public static boolean isPalindrome(int i) {
        char[] chars = String.valueOf(i).toCharArray();
        int length = chars.length;
        for (int j = 0; j < length / 2; j++) {
            if (chars[j] != chars[length - 1 - j])
                return false;
        }
        return true;
    }

    public static boolean isPalindrome1(int i) {
        String str = String.valueOf(i);
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1235321));
        System.out.println(isPalindrome(11322));
        System.out.println(isPalindrome1(11111));
        System.out.println(isPalindrome1(21112));
        System.out.println(isPalindrome1(11114));
    }
}

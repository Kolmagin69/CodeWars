public class Palindrome {

    public static boolean isPalindrome(int i) {
        char[] chars = String.valueOf(i).toCharArray();
        int length = chars.length;
        if (length % 2 != 0)
            chars[length / 2] = (char)0;
        int result = 0;
        for (char chr : chars)
            result ^= chr;
        return result == 0 ? true : false;
    }

    public static boolean isPalindrome1(int i) {
        String str = String.valueOf(i);
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12322));
        System.out.println(isPalindrome1(11111));
        System.out.println(isPalindrome1(21112));
        System.out.println(isPalindrome1(11114));
    }
}

import java.util.Arrays;
import java.util.List;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length())
            return false;
        StringBuilder str = new StringBuilder(s);
        int unique = 0;
        for (char i : part1.toCharArray()) {
            for (int j = unique ; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    str.deleteCharAt(unique = j);
                    break;
                }
            }
        }
        return str.toString().equals(part2);
    }

    public static void main(String[] args) {
        System.out.println(isMerge("codewarcs", "cder", "owacs"));
    }
}

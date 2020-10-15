import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class WordPrefix {

    // first variable
    public static String prefix(String[] strings) {
        if (strings == null)
            return "";
        StringBuilder prefix = new StringBuilder("");
        String firstWord = strings[0] == null ? "" : strings[0];
        int counter = 0;
        int numberWord = strings.length ;
        for (int j = 0; j < firstWord.length(); j++) {
            for (int i = 1; i < numberWord; i++) {
                if(strings[i] == null)
                    return "";
                char chr = firstWord.charAt(j);
                if (chr == strings[i].charAt(j)) {
                    counter+=1;
                }
                if (i == numberWord - 1 && counter != numberWord - 1) {
                    counter=0;
                    break;
                }
                if (counter == numberWord - 1) {
                    prefix.append(chr);
                    counter=0;
                }
            }
        }
        return prefix.toString();
    }

    //second variable
    public static String prefix1(String[] strings) {
    StringBuilder prefix = new StringBuilder("");
        for (int i = 0; i < strings.length; i++) {
            if (strings[0] == null)
                return "";
            char chr = strings[0].charAt(i);
            if(checkPrefix(prefix.toString() + chr, strings))
                prefix.append(chr);
            else {
                return prefix.toString();
            }
        }
        return prefix.toString();
    }

    private static boolean checkPrefix(String prefix, String[] strings){
        for (String str: strings) {
            if (str == null || !str.startsWith(prefix))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = prefix1(new String[]{"aabb", "aabcgt", "aabg"});
        String str = prefix(new String[]{"aabb", "aabcgt", "aabg"});
        System.out.println(str + " " + str1);
        System.out.println(str.equals(str1));
    }
    }

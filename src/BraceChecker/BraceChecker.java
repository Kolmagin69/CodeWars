package BraceChecker;

import java.util.List;
import java.util.ArrayList;

public class BraceChecker {

    public  boolean isValid(String str) {
        List<Character> arrayChar = retArrayChar(str);
        return checkBrackets((ArrayList<Character>) arrayChar);


    }
    public ArrayList<Character> retArrayChar(String str) {
        Character[] standardChar = {'(', '{', '[', ')', '}', ']'};
        ArrayList<Character> arrayChar = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (Character chr: standardChar) {
                if (str.charAt(i) == chr) arrayChar.add(chr);
            }
        }
        return arrayChar;
    }
    public boolean checkBrackets (ArrayList<Character> arrayChar) {
        Character[] standardChar = {')', '}', ']'};
        ArrayList<Character> arrayCharLocal = arrayChar;
        if (arrayChar.size() % 2 != 0) return false;

        for (int i = 0; i < arrayChar.size(); i++) {
            Character chrFor = arrayChar.get(i);
            for (Character chrForeach : standardChar) {
                if (chrFor == chrForeach) {
                    if (arrayChar.get(i - 1) != oppositeBrackets(chrFor)) {
                        return false;
                    }
                    arrayChar.remove(i);
                    i--;
                    arrayChar.remove(i);
                    i--;
                }
            }
        }
        return  true;
    }

    public Character oppositeBrackets (Character chr) {
        Character actualChar = ' ';
        Character[] standardChar1 = {'(', '{', '['};
        Character[] standardChar2 = {')', '}', ']'};
        for (int i = 0; i < standardChar2.length; i++) {
            if (standardChar2[i] == chr)
                actualChar = standardChar1[i];
        }
        return actualChar;
    }


}

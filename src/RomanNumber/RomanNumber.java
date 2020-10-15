package RomanNumber;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public String toRoman(int number) {
        if (number == 0) return "";
        if (number < 0 || number > 9999)
            throw new IllegalArgumentException("min 0 , max 9999");
        String numToStr = String.valueOf(number);
        int length = numToStr.length();
        String result = "";
        if (length == 1)
            return creator(number, length);
        int counter = length;
        for (int i : numToStr.toCharArray())
            result += creator(convertChr(i), length--);
        return result;
    }
        private int convertChr (int number) {
            return number - 48;
    }

        public String creator(int number, int length) {
            String line = ruleOfTree(length);
            String firstChr = String.valueOf(line.charAt(0));
            String secondChr = String.valueOf(line.charAt(1));
            String thirdChr = String.valueOf(line.charAt(2));
            String result = "";
            if (number == 0)
                return result;
            if (number == 1)
                return firstChr;
            if (1 < number && number < 4) {
                for (int i = 0; i < number; i++) {
                    result += firstChr;
                }
                return result;
            }
            if (length < 4) {
                if (number == 4)
                    return firstChr + secondChr;
                if (4 < number && number < 9) {
                    result = secondChr;
                    for (int i = 5; i < number; i++) {
                        result += firstChr;
                    }
                    return result;
                }
                if (number == 9)
                    return firstChr + thirdChr;
            }
            if (length == 4) {
                for (int i = 0; i < number; i++) {
                    result += firstChr;
                }
                return result;
            }
            throw new IllegalArgumentException();
        }

        public String ruleOfTree(int length) {
            if (length == 1)
                return "IVX";
            if (length == 2)
                return "XLC";
            if (length == 3)
                return "CDM";
            return "MMM";
        }




    public static void main(String[] args) {
        RomanNumber romanNumber = new RomanNumber();
        ConsoleScanner scanner = new ConsoleScanner();
        while (true)
            System.out.println(romanNumber.toRoman(scanner.nextNumber()));

    }



}

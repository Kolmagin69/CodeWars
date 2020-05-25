package RomanNumber;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public String toRoman(int number) {
        String numToStr = String.valueOf(number);
        int length = numToStr.length();
        RomanLib lib = new RomanLib();
        String result = "";
            if (length == 1)
               return lib.romanNum.get(number);
            if (length == 2) {
                int firstNum = numToStr.charAt(0) - 48;
                int secondNum = numToStr.charAt(1) - 48;




        }
        return "";
    }
    private class RomanLib {

        Map<Integer, String> romanNum = new HashMap<Integer, String>() {{
            put(1,"I"); put(2,"II"); put(3,"III"); put(4,"IV"); put(5,"V");
            put(6,"VI"); put(7,"VII"); put(8,"VIII"); put(9,"IX"); put(10,"X");
            put(50,"L"); put(100,"C"); put(500,"D"); put(1000,"M");
        }};
        public String creator(int number, int counter) {
            String str = "";
            int key = getKey(number * (int)Math.pow(10, counter - 1));
            String numberStr = romanNum.get(key);
            if ( number < 5) {
                for (int i = 0; i < number; i++) {
                    str += numberStr;
                }
            } else {
                for (int i = 5; i <= number; i++) {
                    str += numberStr;
                }
            }
            return str;
        }

        public int getKey(int number) {
            if ( number < 11)
                return number;
            if (number < 50)
                return 10;
            if (number < 100)
                return 50;
            if (number < 500)
                return 100;
            if (number < 1000)
                return 500;
            return 1000;
        }

    }

    public static void main(String[] args) {
        RomanNumber romanNumber = new RomanNumber();
        RomanLib lib = romanNumber.new RomanLib();
        System.out.println(lib.creator(7,2));
        System.out.println(lib.creator(6,3));
        System.out.println(lib.creator(4,3));

    }



}

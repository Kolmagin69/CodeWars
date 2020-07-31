import java.util.stream.Stream;

public class BitCounting {

    public static int countBits(int number) {
        int counter = 0;
        for (char chr : Integer.toBinaryString(number).toCharArray()) {
            if (chr == '1')
                counter++;
        }
        return counter;
        
    }

    public static void main(String[] args) {
        System.out.println(countBits(10));
    }
}

import java.math.BigInteger;
import java.util.stream.IntStream;

public class NumberOfTrailingZerosOfN {

    public static int zeros(int n){
        int log5_n =(int) (Math.log(n) / Math.log(5));
        int countZero = 0;
        for (int i = 1; i <= log5_n; i++) {
            int countOfFives = n / (int) Math.pow(5, i);
            countZero += countOfFives;
        }
        return countZero;
    }

    public static void main(String[] args) {
        System.out.println(zeros(300));
    }
}

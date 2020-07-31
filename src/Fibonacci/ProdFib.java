package Fibonacci;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] fibArray = fibonacci(50);
        int size = fibArray.length;
        long[] result = new long[3];
        for (int i = 2; i < size; i++) {
            if (i == size - 1) {
                result[0] = 1l;
                result[1] = 1l;
                result[2] = 1l;
            }
            long fib0 = fibArray[i - 1];
            long fib1 = fibArray[i];
            long fib2 = fibArray[i + 1];
            if(fib0 * fib1 < prod && prod <= fib1 * fib2) {
                result[0] = fib1;
                result[0] = fib1;
                result[1] = fib2;
                if(prod / fib1 == fib2)
                    result[2] = 1l;
                else
                    result[2] = 0l;
                return result;
            }
        }
        return null;
    }


    private static long[] fibonacci(int number) {
        long[] fib = new long[number];
        fib[0] = 0;
        fib[1] = 1;
        long previous2 = 0;
        long previous1 = 1;
        for (int i = 2; i < number; i++) {
            long actual = previous1 + previous2;
            fib[i] = actual;
            previous2 = previous1;
            previous1 = actual;
        }
        return fib;
    }

    public static void main(String[] args) {
        long[] array = productFib(1870);
        for (long l : array)
            System.out.print(l + "  ");
        long[] array1 = fibonacci(50);
        int count = 0;
        for (long l1 : array1)
            System.out.println(count++ + " " + l1);
    }

}

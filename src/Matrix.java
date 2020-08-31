import java.util.stream.IntStream;

public class Matrix {
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int length = a.length;
        int[][] result = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sumMulti = 0;
                for (int k = 0; k < length; k++) {
                    sumMulti += a[i][k] * b[k][j];
                }
                result[i][j] = sumMulti;
            }
        }
        return result;
    }
//
//    public static int[][] matrixMultiplication1(int[][] a, int[][] b) {
//        int length = a.length;
//        int[][] result = new int[length][length];
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                result[i][j] = IntStream.iterate(0, k -> k++).co;
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[][] a = {
                { 9, 7 },
                { 0, 1 }};

        int[][] b = {
                { 1, 1 },
                { 4, 12 }};
        int[][] c = matrixMultiplication(a, b);
        for (int[] ints : c) {
            System.out.println();
            for (int i : ints)
                System.out.print(i + " ");
        }
    }
}

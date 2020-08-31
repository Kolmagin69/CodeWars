import java.util.Arrays;

public class RangeExtraction {

    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(arr);
        int size = arr.length;
        int counterEquals = 0;
        for (int i = 0; i < size; i++) {
            int current = arr[i];
            if (i == size - 1) {
                if (counterEquals == 1)
                    result.append(",");
                result.append(current);
                break;
            }
            int next = arr[i + 1];
            if (current != next - 1) {
                if (counterEquals == 1)
                    result.append(",");
                result.append(current).append(",");
                counterEquals = 0;
            }
            if (current == next - 1) {
                counterEquals++;
                if (counterEquals == 1)
                    result.append(current);
                if (counterEquals == 2)
                    result.append("-");
            }
        }
        return result.toString();

    }


    public static void main(String[] args) {
        int[] print = new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println(rangeExtraction(print));
    }
}

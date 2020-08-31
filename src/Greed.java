import java.util.Arrays;

public class Greed {
//    public static int greedy(int[] dice) {
//        int[] counter1
//        for (int i : dice) {
//
//        }
//        return 0;
//    }

    public static int greedy1(int[] dice) {
        int count = 0;
        int result = 0;
        int previous = 0;
        for (int i :Arrays.stream(dice).sorted().toArray()) {
            int j = i == 1 ? 10 : i;
            if (j == 10 || j == 5)
                result+= j*10;
            if (previous == j) {
                count++;
                if (count == 2) {
                    if (j == 10 || j == 5)
                        result += j * 70;
                    else
                        result += j * 100;
                }
            } else count = 0;
            previous = j;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(greedy1(new int[]{4, 4, 5 , 6, 6}));
    }

}

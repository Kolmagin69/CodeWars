import java.util.*;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null) return 0;
        final Set<Integer> valueSet = new HashSet();
        Arrays.stream(intervals).filter(values -> values.length == 2).forEach(values ->{
                    for (int i = values[0]; i < values[1]; i++) {
                        valueSet.add(i);
                    }
                }
        );
        return valueSet.size();
    }

    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{}, {6, 10}, {11, 15}}));
    }


}

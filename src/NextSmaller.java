import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public class NextSmaller {
    public static long nextSmaller(long n){
        Integer[] numbers =  Long.toString(n).chars().boxed().toArray(Integer[]:: new);
        int numberSize = numbers.length;
        for (int i = numberSize - 1; i >= 0 ; i--) {
            Integer actual = numbers[i];
            for (int j = 1; j <= i; j++) {
                int position = i -j;
                Integer next = numbers [position];
                if (next > actual) {
                    Point pointActual = new Point(position,i);
                    Point point = checkSmaller(numbers, pointActual);
                    next = numbers[point.x];
                    actual = numbers[point.y];
                    numbers[point.y] = next;
                    numbers[point.x] = actual;
                    Arrays.sort(numbers, point.x + 1, numberSize, Collections.reverseOrder());
                    StringBuilder resultStr = new StringBuilder();
                    Stream.of(numbers).map(integer -> resultStr.append(integer - 48)).toArray();
                    if (resultStr.toString().startsWith("0"))
                        return -1;
                    return  Long.valueOf(resultStr.toString());
                }
            }
        }
        return -1;
    }
    private static Point checkSmaller(Integer[] numbers, Point point) {
        int x = point.x + 1;
        int y = point.y - 1;
        if (y - x < 1)
            return point;
        for (; y >= x; y--) {
            Integer actual = numbers[y];
            Optional<Integer> sortedNumbers = Stream.of(numbers).sorted(Collections.reverseOrder()).findFirst();
            if (sortedNumbers.get() > actual) {
                for (int j = 1; j <= y; j++) {
                    int position = y - j;
                    Integer next = numbers[position];
                    Arrays.toString(numbers);
                    if (next > actual) {
                        Point pointActual = new Point(position, y);
                        Point pointPossible = checkSmaller(numbers, pointActual);
                        while (pointActual != pointPossible) {
                            System.out.println("loading");
                            pointPossible = checkSmaller(numbers, pointPossible);
                        }
                        return pointPossible.equals(pointActual) ? pointActual : pointPossible;
//                    return new Point(position, y);

                    }
                }
            }

        }
        return point;
    }

    public static long nextSmaller1(long n){
        Integer[] numbers =  Long.toString(n).chars().boxed().toArray(Integer[]:: new);
        int numberSize = numbers.length;
        Point pointActual = new Point(-1, numberSize);
        Point point = checkSmaller(numbers, pointActual);
        if (!pointActual.equals(point)) {
            Integer next = numbers[point.x];
            Integer actual = numbers[point.y];
            numbers[point.y] = next;
            numbers[point.x] = actual;
            Arrays.sort(numbers, point.x + 1, numberSize, Collections.reverseOrder());
            StringBuilder resultStr = new StringBuilder();
            Stream.of(numbers).map(integer -> resultStr.append(integer - 48)).toArray();
            if (resultStr.toString().startsWith("0"))
                return -1;
            return  Long.valueOf(resultStr.toString());
        }

        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(nextSmaller1(143750168l));
        System.out.println(nextSmaller(60375390656417l));
    }

}

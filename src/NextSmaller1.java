import java.awt.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

public class NextSmaller1 {
    public static long nextSmaller(long n){
        StringBuilder str = new StringBuilder(String.valueOf(n)).reverse();
        Integer[] numbers = str.chars().boxed().map(number -> number - 48).toArray(Integer[]::new);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers));
            Point point = new Point(i, numbers[i]);
            System.out.println(point);
            AtomicInteger position = new AtomicInteger(-1);
            Integer next;
            try {
                next = Arrays.stream(numbers).skip(i).filter(number -> {
                    position.getAndIncrement();
                    return number > point.y;
                }).findFirst().get();
            } catch (NoSuchElementException e) {
                next = null;
            }
            if (next != null) {
                System.err.println(next);
                Point point1 = new Point(position.get(), next);
                System.out.println(point1.toString());
                numbers[point.x] = point1.y;
                numbers[point1.x] = point.y;
                Arrays.sort(numbers, 0, point1.x);
                StringBuilder result = new StringBuilder();
                Arrays.stream(numbers).forEach(num -> result.append(num));
                return Long.valueOf(result.reverse().toString());
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(nextSmaller(1027));
    }
}

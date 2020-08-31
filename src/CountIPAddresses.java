import java.util.stream.Stream;

public class CountIPAddresses {

    public static long ipsBetween(final String start, final String end) {
        final int[] ipStart = Stream.of(start.split("\\.")).mapToInt(Integer::valueOf).toArray();
        final int[] ipEnd = Stream.of(end.split("\\.")).mapToInt(Integer::valueOf).toArray();
        return  (ipEnd[0] - ipStart[0]) * 256 * 256 * 256 +
                (ipEnd[1] - ipStart[1]) * 256 * 256 +
                (ipEnd[2] - ipStart[2]) * 256 +
                (ipEnd[3] - ipStart[3]);
    }

    public static void main(String[] args) {
        System.out.println(ipsBetween("10.0.0.0", "10.0.1.50"));
    }

}

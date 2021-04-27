package Java11.Streams;

import java.util.Arrays;
import java.util.List;

public class IntSummaryStatistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        java.util.IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());

        List<Integer> numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        java.util.IntSummaryStatistics stats2 = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Lowest number in List : " + stats2.getMin());

        System.out.println("Sum of all numbers : " + stats.getSum());

        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}

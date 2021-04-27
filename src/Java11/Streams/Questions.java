package Java11.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Questions {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().sorted().collect(Collectors.toList());
        squaresList.stream().forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        //Predicate<? super String> s;
        int count = (int) strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println("count" +count);
    }
}

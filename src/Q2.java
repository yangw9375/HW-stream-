import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[]args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        int k = 3;

        List<String> topKWords = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Top " + k + " frequent words: " + topKWords);


    }

}

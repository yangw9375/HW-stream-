import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String input = "my name is wlyyymmn";


        Map<Character, Long> frequencyMap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0L) + 1);
        }


        Optional<Character> firstNonRepeated = frequencyMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                ;

        System.out.println("First non-repeated character: " + firstNonRepeated);
    }
}
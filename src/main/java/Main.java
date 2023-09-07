import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Schritt 1 - Gerade Zahlen: " + evenNumbers);

        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Schritt 2 - Verdoppelte Zahlen: " + doubledNumbers);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Schritt 3 - Sortierte Zahlen: " + sortedNumbers);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Schritt 4 - Summe aller Zahlen: " + sum);

        numbers.stream()
                .forEach(n -> System.out.println("Schritt 5 - Verarbeitete Zahl: " + n));
        List<Integer> processedNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Schritt 6 - Verarbeitete Zahlen: " + processedNumbers);
    }
}
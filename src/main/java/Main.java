import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//      Schritt 1: Filtert eine Liste von Zahlen und gebt nur die geraden Zahlen aus.

//      Schritt 2: Verwendet 'map' und verdoppelt jede Zahl in der Liste.

//      Schritt 3: Sortiert die Liste in aufsteigender Reihenfolge.

//      Schritt 4: Führt eine 'reduce'-Operation durch, um die Summe aller Zahlen in der Liste zu berechnen.

//      Schritt 5: Nutzt 'forEach' und gebt jede verarbeitete Zahl aus.

//      Schritt 6: Sammelt die verarbeiteten Zahlen in einer neuen Liste mit 'collect'.
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Gerade Zahlen: " + evenNumbers);

        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("Verdoppelte Zahlen: " + doubledNumbers);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();

        System.out.println("Sortierte Zahlen: " + sortedNumbers);



    }
}
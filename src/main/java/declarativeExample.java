import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class declarativeExample {

    public static void main(String[] args) {
       //1
        List<String> cities = Arrays.asList("Pereira", "Medellin", "Bogota", "Bucaramanga");
        cities.stream()
                .map(x -> x.toLowerCase())
                .forEach(System.out::println);
        //2
        List<Integer> numbers = Arrays.asList(2, 1, 4, 1, 3, 5, 12, 32, 76);
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x*x)
                .forEach(System.out::println);

        //3
        List<String> cities1 = Arrays.asList("Pereira", "Medellin", "Bogota", "Bucaramanga");

        Set<String> citiesWithEvenLength =
                cities.stream()
                        .filter(x -> x.length() % 2 == 0)
                        .collect(Collectors.toSet());

        System.out.println(citiesWithEvenLength);

    }

}

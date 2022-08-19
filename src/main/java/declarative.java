import java.util.List;

public class declarative {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Long result = numbers.stream().filter(num -> num > 2).count();
        System.out.println(result);

    }
}

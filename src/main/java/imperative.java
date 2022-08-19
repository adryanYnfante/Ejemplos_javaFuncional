import java.util.List;

public class imperative {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int count = 0;
        for (int number : numbers) {
            if (number > 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}


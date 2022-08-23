package book;

import book.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class FlatMapExample1 {

    public static void main(String[] args) {

        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);


        Set<String> collect =
                list.stream()
                        .map(x -> x.getBook())
                        .flatMap(x -> x.stream())
                        .filter(x -> !x.toLowerCase().contains("python"))
                        .collect(Collectors.toSet());

        collect.forEach(System.out::println);

    }

}
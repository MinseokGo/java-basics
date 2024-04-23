package functionalprogramming.stream;

import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names = List.of("고민석", "박기성", "전종한");
        names.parallelStream()
                .forEach(name -> System.out.println(Thread.currentThread() + ": " + name));

        names.stream()
                .sorted((s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s2, s1))
                .forEach(System.out::println);
    }
}

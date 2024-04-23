package algorithm.study.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] challengers =  new int[7];

        for (int i = 0; i < numbers.length; i++) {
            challengers[numbers[i]] += 1;
        }

        Map<Integer, Double> fails = new HashMap<>();
        double total = numbers.length;

        for (int i = 1; i <= 5; i++) {
            if (challengers[i] == 0) {
                fails.put(i, 0.0);
            }
            if (challengers[i] != 0) {
                fails.put(i, challengers[i] / total);
                total -= challengers[i];
            }
        }

        int[] result = fails.entrySet().stream()
                .sorted(((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())))
                .mapToInt(Map.Entry::getKey)
                .toArray();

        Arrays.stream(result)
                .forEach(System.out::println);
    }
}

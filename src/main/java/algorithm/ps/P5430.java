package algorithm.ps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P5430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            final String functions = br.readLine();
            final int size = Integer.parseInt(br.readLine());
            String input = br.readLine();

            Deque<Integer> numbers = parse(input);
            boolean isPrime = true;
            for (int j = 0; j < functions.length(); j++) {
                final char ch = functions.charAt(j);
                if (ch == 'R') {
                    Deque<Integer> reverse = new ArrayDeque<>();
                    for (int k = 0; k < numbers.size(); k++) {
                        final int last = numbers.removeLast();
                        /*numbers.addFirst(last);
                        reverse.addLast(last);
                        numbers = reverse;
                        System.out.println("reverse = " + reverse);
                        System.out.println("numbers = " + numbers);*/
                    }
                }
                if (ch == 'D') {
                    if (numbers.isEmpty()) {
                        isPrime = false;
                        sb.append("error")
                                .append("\n");
                        break;
                    }
                    numbers.removeFirst();
                }
            }
            if (isPrime) {
                sb.append(numbers)
                        .append("\n");
            }
        }

        System.out.println(sb);
    }

    static Deque<Integer> parse(String input) {
        input = input.substring(1, input.length() - 1);
        StringTokenizer tokens = new StringTokenizer(input, "\\,");
        Deque<Integer> numbers = new ArrayDeque<>();
        while (tokens.hasMoreTokens()) {
            final int number = Integer.parseInt(tokens.nextToken());
            numbers.addLast(number);
        }
        return numbers;
    }
}
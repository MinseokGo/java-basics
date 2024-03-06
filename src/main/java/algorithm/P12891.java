package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokens = new StringTokenizer(br.readLine());
        final int sLength = Integer.parseInt(tokens.nextToken());
        final int pLength = Integer.parseInt(tokens.nextToken());
        final String s = br.readLine();

        tokens = new StringTokenizer(br.readLine());
        int[] check = new int[4];
        int[] counts = new int[4];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(tokens.nextToken());
        }

        for (int i = 0; i < pLength; i++) {
            final char ch = s.charAt(i);
            increase(counts, ch);
        }

        if (isPrime(counts, check)) {
            count++;
        }

        for (int i = pLength; i < sLength; i++) {
            int index = i - pLength;
            final char ch = s.charAt(index);
            decrease(counts, ch);

            final char newCh = s.charAt(i);
            increase(counts, newCh);

            if (isPrime(counts, check)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean isPrime(final int[] counts, final int[] check) {
        for (int j = 0; j < 4; j++) {
            if (counts[j] < check[j]) {
                return false;
            }
        }

        return true;
    }

    static void increase(int[] counts, final char ch) {
        if (ch == 'A') {
            counts[0]++;
        }
        if (ch == 'C') {
            counts[1]++;
        }
        if (ch == 'G') {
            counts[2]++;
        }
        if (ch == 'T') {
            counts[3]++;
        }
    }

    static void decrease(int[] counts, final char ch) {
        if (ch == 'A') {
            counts[0]--;
        }
        if (ch == 'C') {
            counts[1]--;
        }
        if (ch == 'G') {
            counts[2]--;
        }
        if (ch == 'T') {
            counts[3]--;
        }
    }
}
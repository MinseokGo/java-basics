package string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String data1 = "BTS&봉준호,손흥민/고민석";
        String[] arr = data1.split("&|,|/");
        Arrays.stream(arr).forEach(System.out::println);

        String data2 = "BTS/봉준호/손흥민/고민석";
        StringTokenizer stringTokenizer = new StringTokenizer(data2, "/");
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            System.out.println("token = " + token);
        }
    }
}

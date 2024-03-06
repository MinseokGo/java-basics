package string;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringBuilderExam {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(0, 3)
                .replace(0, 3, "ABC")
                .append("D")
                .deleteCharAt(3)
                .toString();
        System.out.println("data = " + data);

        String[] strings = "ab+cd".split("(?<=\\G.{2})");
    }
}

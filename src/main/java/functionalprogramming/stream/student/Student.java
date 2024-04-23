package functionalprogramming.stream.student;

public class Student {

    private final String name;
    private final String sex;
    private final int score;

    private Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getSex() {
        return sex;
    }

    public static Student of(String name, String sex, int score) {
        return new Student(name, sex, score);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(name).append(": ")
                .append(sex).append(", ")
                .append(score)
                .toString();
    }
}

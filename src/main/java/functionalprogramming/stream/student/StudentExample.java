package functionalprogramming.stream.student;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentExample {

    public static void main(String[] args) {
        Student student1 = Student.of("고민석", "남", 100);
        Student student2 = Student.of("전종한", "남", 20);
        Student student3 = Student.of("박기성", "남", 0);
        Student student4 = Student.of("박근희", "여", 99);

        List<Student> students = List.of(student1, student2, student3, student4);

        Map<String, List<Student>> result = students.stream()
                .collect(
                        Collectors.groupingBy(Student::getSex)
                );

        List<Student> male = result.get("남");
        male.forEach(System.out::println);

        List<Student> female = result.get("여");
        female.forEach(System.out::println);
    }
}

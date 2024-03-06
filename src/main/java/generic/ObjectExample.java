package generic;

public class ObjectExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.content = "문자열";

        // 하지만 해당 값을 대입하려면? 형변환이 필요
        // box 의 content 는 Object 타입이기 때문
        // 해당 필드의 타입을 알 수가 없으므로 형변환이 어려움
        String content = (String) box.content;

        // instanceof 연산자로 타입 조사
        // 모든 객체의 타입을 조사할 수 없음
        // 따라서 Object 타입으로 필드 선언은 좋은 방법이 아님
        // 결정되지 않은 타입을 파라미터를 통해 처리하는 제네릭의 등장
        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.content = 10;
        // 형변환이 필요하지 않음
        Integer number = genericBox.content;
    }
}

package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        // 다운 캐스팅 가능
        // Parent > Child 이지만 parent 의 인스턴스는 Child 이므로
        // 크기가 같은 그릇은 서로 포갤 수 있음.
        Parent parent = new Child("go", 20);    // : (Parent) Child
        Child child = (Child) parent;   // : Child

        // 강제 형변환(다운 캐스팅 불가)
        //Parent parent = new Parent("go", 20); : Parent
        //Child child = (Child) parent; (X)
        // Parent > Child 이므로 큰 그릇을 작은 크릇에 넣을 수 없음.
    }
}

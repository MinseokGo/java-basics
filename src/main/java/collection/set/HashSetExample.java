package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<>();

        Member member1 = new Member("홍길동", 20);
        Member member2 = new Member("홍길동", 20);

        System.out.println(member1.equals(member2));
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
        System.out.println(member1.hashCode() == member2.hashCode());

        members.add(member1);
        members.add(member2);

        if (members.size() != 1) {
            throw new RuntimeException();
        }
    }
}

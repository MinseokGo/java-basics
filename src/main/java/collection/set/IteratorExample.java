package collection.set;

import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        Member member1 = new Member("go", 20);
        Member member2 = new Member("GO", 20);
        Member member3 = new Member("Go", 20);
        Member member4 = new Member("gO", 20);

        Set<Member> members = Set.of(member1, member2, member3, member4);
        Iterator<Member> elements = members.iterator();
        while (elements.hasNext()) {
            Member member = elements.next();
            System.out.println(member.toString() + " : " + member.hashCode());
        }

        for (Member member : members) {
            System.out.println(member.toString() + " : " + member.hashCode());
        }
    }
}

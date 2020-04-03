/*
 * Week 10 Example
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable interface.
 * @author emaphis
 */
public class MemberApp {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("mikeal", 182));
        members.add(new Member("matti", 187));
        members.add(new Member("ada", 184));

        members.stream().forEach(m -> System.out.println(m));
        System.out.println();
        members.stream().sorted().forEach(m -> System.out.println(m));
        System.out.println();
        members.stream().forEach(m -> System.out.println(m));
        System.out.println();
        Collections.sort(members);
        members.stream().forEach(m -> System.out.println(m));
    }
}

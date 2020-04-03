/*
 * Week 10 Example
 */
package comparable;

/**
 * implement Comparable to use in Java's sort algorithms.
 * @author emaphis
 */
public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getName() + " (" + getHeight() + ")";
    }

    // Compare by height;
    @Override
    public int compareTo(Member member) {
        return getHeight() - member.getHeight();
    }

}

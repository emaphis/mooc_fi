
public class ClubMember implements  Comparable<ClubMember> {
    private String name;
    private int height;

    public ClubMember(String name, int height) {
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
        return getName() + "(" + getHeight() + ")";
    }

    @Override
    public int compareTo(ClubMember clubMember) {
        return this.height - clubMember.getHeight();
    }

}

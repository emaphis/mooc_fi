
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || Bird.class != obj.getClass())
            return false;

        Bird other = (Bird) obj;

        return this.ringingYear == other.ringingYear && this.latinName.equals(other.latinName);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        if (latinName == null)
            return hash + ringingYear;
        return hash + ringingYear + latinName.hashCode();
    }

}

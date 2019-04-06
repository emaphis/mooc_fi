package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight1) {
        if (weight1 < 0)
            throw new IllegalArgumentException();

        this.name = name;
        this.weight = weight1;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
    
        if (obj == null || this.getClass() != obj.getClass())
            return false;
    
        Thing other = (Thing) obj;   
    
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

}

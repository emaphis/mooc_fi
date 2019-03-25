
public class Book {
    private String name;
    private String contents;
    private int publishingYear;

    public Book(String name, int publishingYear, String contents) {
        this.name = name;
        this.contents = contents;
        this.publishingYear = publishingYear;
    }

    public Book(String name, int publishingYear) {
        this(name, publishingYear, "...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + publishingYear + ")\n"
                + "Contents: " + contents;
    }

    @Override
    public boolean equals(Object object) {
        // not equeal if null
        if (object == null)
            return false;

        if (this.getClass() != object.getClass())
            return false;

        Book compared = (Book) object;

        if (this.publishingYear != compared.publishingYear)
            return false;

        if (this.name == null || !this.name.equals(compared.getName()))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        //int hash = 7;
        //hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
    
        if (name == null)
            return 7;
    
        return name.hashCode() + publishingYear;
    }

}

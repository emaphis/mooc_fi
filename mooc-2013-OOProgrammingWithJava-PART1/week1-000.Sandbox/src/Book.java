
public class Book {
    private String name;
    private String contents;
    private int publishingYear;

    public Book(String name, int publishingYear, String contents) {
        this.name = name;
        this.contents = contents;
        this.publishingYear = publishingYear;
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

}

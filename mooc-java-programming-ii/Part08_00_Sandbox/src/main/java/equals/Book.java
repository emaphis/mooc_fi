// Week 8

package equals;


/**
 *
 * @author emaphis
 */
public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + published + ")\n"
                + "Content: " + content;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }

        if (!(comparedObject instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) comparedObject;

        if (name.equals(comparedBook.name) &&
            published == comparedBook.published &&
            content.equals(comparedBook.content)) {
            return true;
        }

        return false;
    }

}

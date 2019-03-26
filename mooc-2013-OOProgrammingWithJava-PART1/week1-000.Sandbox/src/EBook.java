
import java.util.ArrayList;


public class EBook implements Readable {
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public EBook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int howManyPages() {
        return pages.size();
    }

    private void nextPage() {
        pageNumber++;
        if (pageNumber % pages.size() == 0) {
            pageNumber = 0;
        }
    }

    @Override
    public String read() {
        String page = pages.get(pageNumber);
        nextPage();
        return page;
    }
}

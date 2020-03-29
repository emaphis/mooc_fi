/*
 * Week 9 Example
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class Ebook implements Readable {
    private String namme;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String namme, ArrayList<String> pages) {
        this.namme = namme;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getNamme() {
        return namme;
    }

    public int pages() {
        return pages.size();
    }

    @Override
    public String read() {
        String page = pages.get(pageNumber);
        nextPage();
        return page;
    }

    private void nextPage() {
        pageNumber++;
        if (pageNumber % pages.size() == 0) {
            pageNumber = 0;
        }
    }
}

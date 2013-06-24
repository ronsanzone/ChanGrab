package com.android.changrab.chan;

import java.util.ArrayList;

/**
 * Created by thunaer on 6/22/13.
 */
public class Thread {
    protected ArrayList<Page> pages = new ArrayList<Page>();
    protected int currentPage;
    protected int numberPages;

    public ArrayList<Page> getPages()
    {
        return this.pages;
    }
    public Page getCurrentPage(){
        return pages.get(currentPage);
    }
    public int getCurrentPageNumber() {
        return currentPage;
    }
    public void advancePage() {
        this.currentPage = currentPage + 1;
    }
    public int getNumberPages() {
        return numberPages;
    }
    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
    public void addPage(Page page)
    {
        pages.add(page);
        numberPages = pages.size();
    }
}

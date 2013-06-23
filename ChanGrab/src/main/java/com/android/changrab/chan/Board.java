package com.android.changrab.chan;

import java.util.ArrayList;

/**
 * Created by thunaer on 6/22/13.
 */
public class Board {
    ArrayList<Page> pages = new ArrayList<Page>();

    public void addPage(Page page)
    {
        pages.add(page);
    }
}

package com.android.changrab.chan;

import java.util.ArrayList;

/**
 * Created by thunaer on 6/23/13.
 */
public class Page {
    protected ArrayList<Thread> threads = new ArrayList<Thread>();

    public ArrayList<Thread> getThreads() {
        return this.threads;
    }
    public void addThread(Thread thread)
    {
        this.threads.add(thread);
    }

}

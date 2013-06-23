package com.android.changrab.chan;

import java.util.ArrayList;

/**
 * Created by thunaer on 6/22/13.
 */
public class Thread {
    protected ArrayList<Post> posts = new ArrayList<Post>();

    public void addPost(Post post) {
        posts.add(post);
    }

}

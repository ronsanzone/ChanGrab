package com.android.changrab.chan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by thunaer on 6/22/13.
 */
public class PageHelper {
    public Page page;

    public PageHelper(Page page)
    {
        super();
        this.page = page;
    }
    public Board populateBoard() {
        return null;
    }
    public Page getPage()
    {
        return this.page;
    }
    public void parseJSONResponse(JSONObject response) {
        // TODO Auto-generated method stub

        try {
            JSONArray threads = response.getJSONArray("thread");
            this.page  = parsePage(threads);
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public Page parsePage(JSONArray threads) throws JSONException {
        Page page = new Page();
        for(int count = 0; count < threads.length(); count++) {
            JSONObject aThread = threads.getJSONObject(count);
            JSONArray posts = aThread.getJSONArray("posts");
            page.addThread(parseThread(posts));
        }
        return page;
    }
    public Thread parseThread(JSONArray posts) throws JSONException {
        Thread thread = new Thread();
        for(int count = 0; count < posts.length(); count++) {
            JSONObject aPost = posts.getJSONObject(count);
            thread.addPost(parsePost(aPost));
        }
        return thread;
    }
    public Post parsePost(JSONObject aPost) {
        Post post = new Post();

        long no = aPost.optInt("no");
        String name = aPost.optString("name");
        String com = aPost.optString("com");

        post.setNo(no);
        post.setName(name);
        post.setComment(com);
        return post;
    }
}

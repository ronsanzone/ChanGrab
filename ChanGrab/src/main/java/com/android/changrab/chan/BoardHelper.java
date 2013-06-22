package com.android.changrab.chan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by thunaer on 6/22/13.
 */
public class BoardHelper {
    public Board board;

    public BoardHelper(Board board)
    {
        super();
        this.board = board;
    }
    public void parseJSONResponse(JSONObject response) {
        // TODO Auto-generated method stub

        try {
            JSONArray threads = response.getJSONArray("thread");

            parseBoard(threads);
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void parseBoard(JSONArray threads) throws JSONException {
        for(int count = 0; count < threads.length(); count++) {
            JSONObject aThread = threads.getJSONObject(count);
            JSONArray posts = aThread.getJSONArray("posts");
            parseThread(posts);
        }
    }
    public void parseThread(JSONArray posts) throws JSONException {
        for(int count = 0; count < posts.length(); count++) {
            JSONObject aPost = posts.getJSONObject(count);
            parsePost(aPost);
        }
    }
    public void parsePost(JSONObject post) {}
}

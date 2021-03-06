package com.android.changrab;

import android.app.ProgressDialog;
import android.content.Context;

import com.android.changrab.chan.*;
import com.android.volley.*;
import com.android.volley.toolbox.*;

import org.json.JSONObject;

/**
 * Main Working class for the ChanGrab library
 * Created by Ron on 6/22/13.
 */
public class ChanGrab {
    private Board board = new Board();
    private Page page = new Page();
    private PageHelper pageHelper;
    private Context context;
    private String url = "";
    private ProgressDialog progress;

    public ChanGrab(Context context, Board board, String url)
    {
        this.context = context.getApplicationContext();
        this.board = board;
        this.url = url;
        this.pageHelper = new PageHelper(page);
    }
    public void initiateVolley() {
        //listView.setAdapter(ba);
        RequestQueue reqQueue = Volley.newRequestQueue(context);

        JsonObjectRequest jr = new JsonObjectRequest(Request.Method.GET, url,
                null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                // TODO Auto-generated method stub
                pageHelper.parseJSONResponse(response);
                //ba.notifyDataSetChanged();
                progress.dismiss();
            }

        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub
                //Log.v(TAG, error.getMessage());
            }
        });

        progress = ProgressDialog.show(context, "",
                "Loading google's official blogs");
        reqQueue.add(jr);
    }
    public void populateBoard() {
        initiateVolley();
        this.board.addPage(pageHelper.getPage());
    }
    public Board getBoard()
    {
        return board;
    }


}

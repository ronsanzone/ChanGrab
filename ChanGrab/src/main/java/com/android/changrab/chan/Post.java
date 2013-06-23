package com.android.changrab.chan;

import java.util.Calendar;

/**
 * Created by thunaer on 6/22/13.
 */
public class Post {
    protected Board board;
    protected long no = 0L;
    protected Calendar time = null;
    protected String subject = "";
    protected String name = "";
    protected String tripcode = "";
    protected String email = "";
    protected String capcode = "";
    protected String countryCode = "";
    protected String countryName = "";
    protected String comment = "";
    protected long imageId = 0L;
    protected String imageName = "";
    protected String imageExtension = "";

    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public long getNo() {
        return no;
    }
    public void setNo(long no) {
        this.no = no;
    }
    public Calendar getTime() {
        return time;
    }
    public void setTime(Calendar time) {
        this.time = time;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTripcode() {
        return tripcode;
    }
    public void setTripcode(String tripcode) {
        this.tripcode = tripcode;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCapcode() {
        return capcode;
    }
    public void setCapcode(String capcode) {
        this.capcode = capcode;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public long getImageId() {
        return imageId;
    }
    public void setImageId(long imageId) {
        this.imageId = imageId;
    }
    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    public String getImageExtension() {
        return imageExtension;
    }
    public void setImageExtension(String imageExtension) {
        this.imageExtension = imageExtension;
    }
}

package com.springbootformtion.demo.rest;

public class Studenterrorresponse {
    private int status;
    private String messge;
    private long timestamp;
    public Studenterrorresponse(){

    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Studenterrorresponse(int status, String messge, long timestamp) {

        this.status = status;
        this.messge = messge;
        this.timestamp = timestamp;
    }
}

package com.example.administrator.postrecyclerview;

/**
 * Created by Administrator on 2017-07-01.
 */

public class ReplyData {
    String reply_img;
    String reply_name;
    String reply_reply;
    String reply_time;

    public ReplyData(String reply_img, String reply_name, String reply, String reply_time){
        this.reply_img = reply_img;
        this.reply_name = reply_name;
        this.reply_reply = reply;
        this.reply_time = reply_time;
    }

    public String getReply_img() {return reply_img;}
    public String getReply() {return  reply_reply;}
    public String getProfile_name() {return reply_name;}
    public String getReply_time() {return reply_time;}

}

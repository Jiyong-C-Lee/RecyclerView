package com.example.administrator.postrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-07-01.
 */

public class ReplyRecyclerViewHolder extends RecyclerView.ViewHolder {
    public ImageView profile_img;
    public TextView profile_name;
    public TextView reply;
    public TextView reply_time;
    public Button write_reply_btn;

    public ReplyRecyclerViewHolder(View itemView) {
        super(itemView);

        profile_img = (ImageView)itemView.findViewById(R.id.reply_recyclerview_profile_img);
        profile_name = (TextView)itemView.findViewById(R.id.reply_recyclerview_profile_name);
        reply = (TextView)itemView.findViewById(R.id.reply_reply);
        reply_time = (TextView)itemView.findViewById(R.id.reply_recyclerview_reply_time);
        write_reply_btn = (Button)itemView.findViewById(R.id.reply_recyclerview_write_reply_btn);

    }

}

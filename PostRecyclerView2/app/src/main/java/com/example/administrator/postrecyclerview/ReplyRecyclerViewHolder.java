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
    public ImageView reply_profile_img;
    public TextView reply_profile_name;
    public TextView reply_reply;
    public TextView reply_time;
    public Button reply_reply_btn;
    public Button reply_bulb_btn;
    public TextView reply_reply_count;
    public TextView reply_bulb_count;

    public ReplyRecyclerViewHolder(View itemView) {
        super(itemView);

        reply_profile_img = (ImageView)itemView.findViewById(R.id.reply_recyclerview_profile_img);
        reply_profile_name = (TextView)itemView.findViewById(R.id.reply_recyclerview_profile_name);
        reply_reply = (TextView)itemView.findViewById(R.id.reply_reply);
        reply_time = (TextView)itemView.findViewById(R.id.reply_recyclerview_reply_time);
        reply_reply_btn = (Button)itemView.findViewById(R.id.reply_reply_btn);
        reply_bulb_btn = (Button)itemView.findViewById(R.id.reply_bulb_btn);
        reply_reply_count = (TextView) itemView.findViewById(R.id.reply_reply_count);
        reply_bulb_count = (TextView)itemView.findViewById(R.id.reply_bulb_count);

    }

}

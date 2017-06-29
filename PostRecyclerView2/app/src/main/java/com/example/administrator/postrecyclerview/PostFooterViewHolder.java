package com.example.administrator.postrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-06-30.
 */

public class PostFooterViewHolder extends RecyclerView.ViewHolder {

    TextView post_profile_position;
    TextView post_profile_name;
    ImageView post_profile_img;
    Button post_profile_btn;
    TextView post_comment;
    TextView post_comment_content;
    Button post_tool_bulb;
    Button post_tool_reply;
    Button post_tool_collect;

    public PostFooterViewHolder(View itemView) {
        super(itemView);

        post_profile_position = (TextView)itemView.findViewById(R.id.post_profile_position);
        post_profile_name = (TextView)itemView.findViewById(R.id.post_profile_name);
        post_profile_img = (ImageView)itemView.findViewById(R.id.post_profile_img);
        post_profile_btn = (Button)itemView.findViewById(R.id.post_profile_btn);
        post_comment = (TextView)itemView.findViewById(R.id.post_comment);
        post_comment_content = (TextView)itemView.findViewById(R.id.post_comment_content);
        post_tool_bulb = (Button)itemView.findViewById(R.id.post_tool_bulb);
        post_tool_reply = (Button)itemView.findViewById(R.id.post_tool_reply);
        post_tool_collect = (Button)itemView.findViewById(R.id.post_tool_collect);
    }
}

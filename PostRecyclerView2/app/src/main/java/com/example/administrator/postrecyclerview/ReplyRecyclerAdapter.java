package com.example.administrator.postrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-07-01.
 */

public class ReplyRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<ReplyData> item_list;
    View.OnClickListener click_listener;

    public ReplyRecyclerAdapter(ArrayList<ReplyData> item_list, View.OnClickListener click_listener){
        this.item_list = item_list;
        this.click_listener = click_listener;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reply_recyclerview_item, parent, false);
        view.setOnClickListener(click_listener);
        return new ReplyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //프로필 이미지, 이름 받아오기
        //((ReplyRecyclerViewHolder) holder).reply_profile_img.setImageResource(Integer.parseInt(item_list.get(position).reply_img));
        ((ReplyRecyclerViewHolder) holder).reply_profile_name.setText(item_list.get(position).reply_name);
        //리플 받아오기
        //리플 시간 받아오기
    }

    @Override
    public int getItemCount() {
        return item_list.size();
    }
}

package com.example.administrator.postrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-06-29.
 */

public class PostRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<PostItems> item_list;
    View.OnClickListener click_listener;
    final int TYPE_BASE = 1;
    final int TYPE_FOOTER = 2;


    public PostRecyclerAdapter(ArrayList<PostItems> item_list, View.OnClickListener click_listener) {
        this.item_list = item_list;
        this.click_listener = click_listener;

    }

    @Override
    public int getItemViewType(int position) {
        if(position == item_list.size()+1) {return TYPE_FOOTER;}
        else {return TYPE_BASE; }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        switch (viewType){
            case TYPE_BASE :
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_recyclerview_item,parent,false);
                view.setOnClickListener(click_listener);
                return new PostRecyclerViewHolder(view);
            case TYPE_FOOTER :
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_recyclerview_footer,parent,false);
                view.setOnClickListener(click_listener);
                return new PostFooterViewHolder(view);
            default : return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof PostFooterViewHolder){
            /* 프로필 이미지, 이름, 직업 받아오기
            ((PostFooterViewHolder) holder).post_profile_position.setText();
            ((PostFooterViewHolder) holder).post_profile_position.setText();
            */


            }

        else if(holder instanceof PostRecyclerViewHolder){
            ((PostRecyclerViewHolder) holder).img.setImageResource(item_list.get(position).img);
            ((PostRecyclerViewHolder) holder).text.setText(item_list.get(position).text);
        }
        /*
        PostRecyclerViewHolder mholder = (PostRecyclerViewHolder) holder;
        mholder.img.setImageResource(item_list.get(position).img);
        mholder.text.setText(item_list.get(position).text);
        */


    }

    @Override
    public int getItemCount() {

        //아이템 카운터
        return item_list != null ? item_list.size() + 1 : 0;
    }
}
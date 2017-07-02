package com.example.administrator.postrecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by Administrator on 2017-07-02.
 */

public class CreateActivity extends Activity {

    Button create_topbar_back_btn;
    ScrollView create_scrollview;
    TabLayout create_tab_layout;
    TabItem create_tab_short;
    TabItem create_tab_series;
    LinearLayout create_keycard_layout;
    EditText create_keycard_edittext;
    EditText create_title_edittext;
    EditText create_sub_title_edittext;
    EditText create_explain_edittext;
    RecyclerView create_content_recyclerview;
    EditText create_comment_edittext;
    ImageButton create_cardcover_imgbtn;
    Button create_agree_checkbox_btn;
    Button create_blossom_btn;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        create_topbar_back_btn = (Button)findViewById(R.id.create_topbar_back_btn);
        create_scrollview = (ScrollView)findViewById(R.id.create_scrollview);
        create_tab_layout = (TabLayout)findViewById(R.id.create_tab_layout);
        create_tab_short = (TabItem)findViewById(R.id.create_tab_short);
        create_tab_series = (TabItem)findViewById(R.id.create_tab_series);
        create_keycard_layout = (LinearLayout)findViewById(R.id.create_keycard_layout);
        create_keycard_edittext = (EditText)findViewById(R.id.create_keycard_edittext);
        create_title_edittext = (EditText)findViewById(R.id.create_title_edittext);
        create_sub_title_edittext = (EditText)findViewById(R.id.create_sub_title_edittext);
        create_explain_edittext = (EditText)findViewById(R.id.create_explain_edittext);
        create_content_recyclerview = (RecyclerView)findViewById(R.id.create_content_recyclerview);
        create_comment_edittext = (EditText)findViewById(R.id.create_comment_edittext);
        create_cardcover_imgbtn = (ImageButton)findViewById(R.id.create_cardcover_imgbtn);
        create_agree_checkbox_btn = (Button)findViewById(R.id.create_agree_checkbox_btn);
        create_blossom_btn = (Button)findViewById(R.id.create_blossom_btn);


        /*backbtn클릭
        create_topbar_back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        */

        /*imgbtn클릭
        create_cardcover_imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity();
                create_cardcover_imgbtn.setImageResource();
            }
        });*/

        /*blossom클릭
        create_blossom_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            startActivity();
            finish();
            }
        });
        */



    }
}

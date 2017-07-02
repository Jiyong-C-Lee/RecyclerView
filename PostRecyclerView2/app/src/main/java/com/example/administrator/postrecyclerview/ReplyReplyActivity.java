package com.example.administrator.postrecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017-07-02.
 */

public class ReplyReplyActivity extends Activity {

    Button reply_reply_back_btn;
    //recyclerview
    ImageView reply_reply_botton_profile_img;
    EditText reply_reply_input_reply;
    Button reply_reply_input_btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply_reply);

        reply_reply_back_btn = (Button)findViewById(R.id.reply_reply_back_btn);
        reply_reply_botton_profile_img = (ImageView)findViewById(R.id.reply_reply_bottom_profile_img);
        reply_reply_input_reply = (EditText)findViewById(R.id.reply_reply_input_reply);
        reply_reply_input_btn = (Button)findViewById(R.id.reply_reply_input_btn);

        /*backbtn
        reply_reply_back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/

        /*inputbtn
        reply_reply_input_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}

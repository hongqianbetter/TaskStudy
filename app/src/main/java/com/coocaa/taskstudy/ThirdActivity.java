package com.coocaa.taskstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    public static void show(Context mContext){
        Intent intent = new Intent(mContext, ThirdActivity.class);
        mContext.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
      TextView third = findViewById(R.id.third);

//      third.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//
//          }
//      });
        Log.e("777","ThirdActivity:  "+getTaskId());
    }
}
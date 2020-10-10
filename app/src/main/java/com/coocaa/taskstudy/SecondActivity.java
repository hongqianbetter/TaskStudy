package com.coocaa.taskstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    public static void show(Context mContext){
        Intent intent = new Intent(mContext, SecondActivity.class);
        mContext.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView second = findViewById(R.id.second);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdActivity.show(SecondActivity.this);
            }
        });
        Log.e("777","SecondActivity:  "+getTaskId());
    }
}
package com.example.zhangzhaoxiang.activitytofragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TEXT extends AppCompatActivity {
      private Button text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        text=(Button)findViewById(R.id.text);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent show=new Intent(TEXT.this,MainActivity.class);

                show.putExtra("id",1);
                startActivity(show);
                finish();
            }
        });



    }
}

package com.example.zhangzhaoxiang.activitytofragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;


public class NO1 extends Fragment {
private Button text1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //不同的Activity对应不同的布局
        View view = inflater.inflate(R.layout.fragment_no1, container, false);
text1 =(Button)view.findViewById(R.id.text1);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getActivity(), TEXT.class);
                startActivity(i);
            }
        });
    }
}

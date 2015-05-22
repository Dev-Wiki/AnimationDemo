package com.asia.animationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private Button frameAnimationButton;
    private void initView(){
        frameAnimationButton = (Button) super.findViewById(R.id.btn_frame_animation);
        frameAnimationButton.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_frame_animation:
                startActivity(new Intent(MainActivity.this, FrameAnimation.class));
                break;
            default:
                break;
        }
    }
}

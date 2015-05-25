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
    private Button animatorButton;
    private void initView(){
        frameAnimationButton = (Button) super.findViewById(R.id.btn_frame_animation);
        frameAnimationButton.setOnClickListener(this);
        animatorButton = (Button) super.findViewById(R.id.btn_animator_animation);
        animatorButton.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_frame_animation:
                startActivity(new Intent(MainActivity.this, FrameAnimation.class));
                break;
            case R.id.btn_animator_animation:
                startActivity(new Intent(MainActivity.this, AnimatorActivity.class));
                break;
            default:
                break;
        }
    }
}

package com.asia.animationdemo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class AnimatorActivity extends Activity implements OnClickListener{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
        initView();
    }

    private ImageView penguinView;
    private Button startButton;
    private Button stopButton;
    private void initView() {
        penguinView = (ImageView) super.findViewById(R.id.iv_animator_penguin);
        startButton = (Button) super.findViewById(R.id.btn_animator_start);
        startButton.setOnClickListener(this);
        stopButton = (Button) super.findViewById(R.id.btn_animator_stop);
        stopButton.setOnClickListener(this);
    }
    
    private Animator lineAnimator;
    private void lineAnimator(){
    }
    
    @Override
    public void onClick(View v) {
        
    }
}

package com.asia.animationdemo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;

public class FrameAnimation extends Activity implements OnClickListener, OnCheckedChangeListener{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        initView();
    }

    private Button startButton;
    private Button stopButton;
    private CheckBox oneShotBox;
    private ImageView microView;
    private AnimationDrawable animation;
    private void initView() {
        startButton = (Button) super.findViewById(R.id.btn_frame_start);
        startButton.setOnClickListener(this);
        stopButton = (Button) super.findViewById(R.id.btn_frame_stop);
        stopButton.setOnClickListener(this);
        oneShotBox = (CheckBox) super.findViewById(R.id.cb_oneshot);
        oneShotBox.setOnCheckedChangeListener(this);
        microView = (ImageView) super.findViewById(R.id.iv_frame_micro);
        animation = (AnimationDrawable) microView.getBackground();
        animation.setOneShot(oneShotBox.isChecked());
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_frame_start:
                startAnimation();
                break;
            case R.id.btn_frame_stop:
                stopAnimation();
                break;
            default:
                break;
        }
    }
    
    private void stopAnimation() {
        animation.stop();
    }
    
    private void startAnimation() {
        if (animation.isRunning()) {
            animation.stop();
        }
        animation.start();
    }
    
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            animation.setOneShot(true);
        } else {
            animation.setOneShot(false);
        }
    }

}

package com.asia.animationdemo;

import com.asia.animationdemo.util.UIUtil;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Path;
import android.graphics.Rect;
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
        createAnimator();
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
    
    private Animator lineInAnimator;
    private Animator lineOutAnimator;
    private Animator rotationAnimator;
    private void createAnimator(){
        int screenWidth = UIUtil.getScreenWidthInPx(this);
        int screenHeight = UIUtil.getScreenHeightInPx(this);
        int width = penguinView.getWidth();
        int height = penguinView.getHeight();
        Path path = new Path();
        Rect rect = new Rect();
        rect.bottom = screenHeight - height;
        rect.top = height;
        rect.left = width;
        rect.right = screenWidth - width;
        float half = width/2;
        lineInAnimator = ObjectAnimator.ofFloat(penguinView, "translationX", 0f, width);
        lineInAnimator.setDuration(10000);
        lineOutAnimator = ObjectAnimator.ofFloat(penguinView, "translationX", half, width);
        lineOutAnimator.setDuration(10000);
        rotationAnimator = ObjectAnimator.ofFloat(penguinView, "rotation", 0f, 3600f);
        rotationAnimator.setDuration(10000);
    }
    
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_animator_start) {
            AnimatorSet set = new AnimatorSet();
            set.play(lineInAnimator).with(rotationAnimator);
            set.start();
        }
    }
}

package com.example.randomtextinsidebox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;

public class newact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newact);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ProgressBar progressBar = (ProgressBar)findViewById(R.id.spin_kit);
                Sprite doubleBounce = new DoubleBounce();
                progressBar.setIndeterminateDrawable(doubleBounce);
                Intent intent=new Intent(newact.this,MainActivity.class);
                startActivity(intent);
            }
        },4000);
    }
}

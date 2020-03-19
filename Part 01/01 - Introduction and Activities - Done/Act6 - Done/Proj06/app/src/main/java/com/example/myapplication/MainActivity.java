package com.example.myapplication;
/** Description: Slide to Activity*/

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** ImportLib {@Intent,@View}. */
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
package com.example.myapplication;
/** Activity Switcher */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** ImportLib {@Button,@Intent,@View}. */
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    /** Declare {@Button}. */
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /** Create instance and set View to {@activity_main.xml}. */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        /** On button click change view to {@Activity2}. */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
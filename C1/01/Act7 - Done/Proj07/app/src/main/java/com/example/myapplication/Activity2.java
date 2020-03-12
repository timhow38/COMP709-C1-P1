package com.example.myapplication;
 
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
 
import maes.tech.intentanim.CustomIntent;
 
public class Activity2 extends AppCompatActivity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
 
    @Override
    public void finish() {
        super.finish();
        CustomIntent.customType(this, "fadein-to-fadeout");
    }
}
package com.example.kids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class buah extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
    }
    public void learningClick(View view)
    {
        Intent intent = new Intent(this, LearningbuahActivity.class);
        startActivity(intent);
        this.finish();
    }
    public void GameClick(View view) {
        Intent intent = new Intent(this, GameBuahActivity.class);
        startActivity(intent);
        this.finish();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
            this.finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

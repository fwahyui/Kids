package com.example.kids;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
public class Learning_family_Activity extends Activity {
	MediaPlayer mediaPlayer;
	@Override
	protected void onCreate(Bundle savedInstanceState) 	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learning_family);
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent(this, MenuActivity.class);
			startActivity(intent);
			this.finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	public void onMainClick(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		Intent intent = new Intent(this, MenuActivity.class);
		startActivity(intent);
		this.finish();
	}
	public void onButton1Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bapak);
		mediaPlayer.start();
	}
	public void onButton2Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.ibu);
		mediaPlayer.start();
	}
	public void onButton3Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.kakek);
		mediaPlayer.start();
	}
	public void onButton4Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.nenek);
		mediaPlayer.start();
	}
	public void onButton5Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mas);
		mediaPlayer.start();
	}
	public void onButton6Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mbak);
		mediaPlayer.start();
	}
}

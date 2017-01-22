package com.example.kids;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class ThentotwintyActivity extends Activity {
	private InterstitialAd interstitial;
	MediaPlayer mediaPlayer;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thentotwinty);
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent(this, MenuActivity.class);
			startActivity(intent);
			this.finish();
			displayInterstitial();
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
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.elevenn);
		mediaPlayer.start();
	}

	public void onButton2Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.twilevee);
		mediaPlayer.start();
	}

	public void onButton3Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.threethenn);
		mediaPlayer.start();
	}

	public void onButton4Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.forthenn);
		mediaPlayer.start();
	}

	public void onButton5Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.fivethenn);
		mediaPlayer.start();
	}

	public void onButton6Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sixthenn);
		mediaPlayer.start();
	}

	public void onButton7Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sevnthenn);
		mediaPlayer.start();
	}

	public void onButton8Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.eightthenn);
		mediaPlayer.start();
	}

	public void onButton9Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.ninthenn);
		mediaPlayer.start();
	}

	public void onButton10Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.twintyy);
		mediaPlayer.start();
	}

	public void onButton11Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sleon);
		mediaPlayer.start();
	}

	public void onButton12Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.smono);
		mediaPlayer.start();
	}

	public void onButton13Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.soso);
		mediaPlayer.start();
	}

	public void onButton14Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.soveja);
		mediaPlayer.start();
	}

	public void onButton15Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.spaloma);
		mediaPlayer.start();
	}

	public void onButton16Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.spato);
		mediaPlayer.start();
	}

	public void onButton17Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sperro);
		mediaPlayer.start();
	}

	public void onButton18Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.srana);
		mediaPlayer.start();
	}

	public void onButton19Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sserpiente);
		mediaPlayer.start();
	}

	public void onButton20Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sburro);
		mediaPlayer.start();
	}
	public void onNextClick(View view){
		if (mediaPlayer != null)
			mediaPlayer.stop();
		Intent intent = new Intent(this, Twintytoonehan.class);
		startActivity(intent);
		this.finish();
		
	}
	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}

}

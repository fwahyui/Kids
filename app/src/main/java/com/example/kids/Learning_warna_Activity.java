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

public class Learning_warna_Activity extends Activity {
	MediaPlayer mediaPlayer;
	private InterstitialAd interstitial;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learning_warna);
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
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.hitam);
		mediaPlayer.start();
	}

	public void onButton2Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.biru);
		mediaPlayer.start();
	}

	public void onButton3Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.coklat);
		mediaPlayer.start();
	}

	public void onButton4Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.putih);
		mediaPlayer.start();
	}

	public void onButton5Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.hijau);
		mediaPlayer.start();
	}

	public void onButton6Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.kuning);
		mediaPlayer.start();
	}

	public void onButton7Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.merrah);
		mediaPlayer.start();
	}

	public void onButton8Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.ungu);
		mediaPlayer.start();
	}

	public void onButton9Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.pear);
		mediaPlayer.start();
	}

	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}
}

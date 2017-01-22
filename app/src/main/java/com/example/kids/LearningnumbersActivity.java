package com.example.kids;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class LearningnumbersActivity extends Activity {
	private InterstitialAd interstitial;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learningnumbers);
	}
	public void onetothenClick(View view) {
		Intent intent = new Intent(this, OnetothenActivity.class);
		startActivity(intent);
		this.finish();
	}
	public void thentotwintyClick(View view) {
		Intent intent = new Intent(this, ThentotwintyActivity.class);
		startActivity(intent);
		this.finish();
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent(this, NumbersActivity.class);
			startActivity(intent);
			this.finish();
			displayInterstitial();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	public void twintytooneClick(View view){
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

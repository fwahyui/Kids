package com.example.kids;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class NumbersActivity extends Activity {
	private InterstitialAd interstitial;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numbers);
		// Buscar AdView como recurso y cargar una solicitud.
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);
		// Intersetial.
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId(getString(R.string.admob_id_intt));
		AdRequest adRequestInterstitial = new AdRequest.Builder().build();
		interstitial.loadAd(adRequestInterstitial);
	}
	public void gameClick(View view) {
		Intent intent = new Intent(this, LearningnumbersActivity.class);
		startActivity(intent);
		this.finish();
	}
	public void learningClick(View view) {
		Intent intent = new Intent(this, GamenumbersActivity.class);
		startActivity(intent);
		this.finish();
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
	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}

}

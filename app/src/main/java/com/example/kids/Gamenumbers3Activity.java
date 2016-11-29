package com.example.kids;

import java.util.Random;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Gamenumbers3Activity extends Activity {
	Random r = new Random();
	MediaPlayer mediaPlayer;
	private ImageButton button1;
	private ImageButton button2;
	private ImageButton button3;
	private ImageButton button4;
	private TextView scoretxt;
	int res;
	int a0;
	int a1;
	int a2;
	int a3;
	public static int score=0;
	private InterstitialAd interstitial;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gamenumbers3);
		// Buscar AdView como recurso y cargar una solicitud.
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);
		// Intersetial.
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId(getString(R.string.admob_id_intt));
		AdRequest adRequestInterstitial = new AdRequest.Builder().build();
		interstitial.loadAd(adRequestInterstitial);


		button1 = (ImageButton) findViewById(R.id.button1);
		button2 = (ImageButton) findViewById(R.id.button2);
		button3 = (ImageButton) findViewById(R.id.button3);
		button4 = (ImageButton) findViewById(R.id.button4);
		scoretxt= (TextView)    findViewById(R.id.scoretxt);
		this.setGame();
	}
	
	public void setGame() {
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);

		button1.setBackgroundResource(R.drawable.myboton);
		button2.setBackgroundResource(R.drawable.myboton);
		button3.setBackgroundResource(R.drawable.myboton);
		button4.setBackgroundResource(R.drawable.myboton);

		a0 = r.nextInt(20);
		a1 = r.nextInt(20);
		while (a1 == a0) {
			a1 = r.nextInt(20);
		}
		a2 = r.nextInt(20);
		while ((a2 == a0) || (a2 == a1)) {
			a2 = r.nextInt(20);
		}
		a3 = r.nextInt(20);
		while ((a3 == a0) || (a3 == a1) || (a3 == a2)) {
			a3 = r.nextInt(20);
		}

		this.setImage(button1, a0);
		this.setImage(button2, a1);
		this.setImage(button3, a2);
		this.setImage(button4, a3);

		int i = r.nextInt(4);
		switch (i) {
		case 0:
			this.res = a0;
			break;
		case 1:
			this.res = a1;
			break;
		case 2:
			this.res = a2;
			break;
		case 3:
			this.res = a3;
			break;
		}
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = setSound(res);
		mediaPlayer.start();
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
		if (res == a0) {
			button1.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
			score++;
			scoretxt.setText(""+score);
		} else {
			button1.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
			score--;
			scoretxt.setText(""+score);
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public void onButton2Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		if (res == a1) {
			button2.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
			score++;
			scoretxt.setText(""+score);
		} else {
			button2.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
			score--;
			scoretxt.setText(""+score);
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public void onButton3Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		if (res == a2) {
			button3.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
			score++;
			scoretxt.setText(""+score);
		} else {
			button3.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
			score--;
			scoretxt.setText(""+score);
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public void onButton4Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		if (res == a3) {
			button4.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
			score++;
			scoretxt.setText(""+score);
		} else {
			button4.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
			score--;
			scoretxt.setText(""+score);
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public MediaPlayer setSound(int num) {
		switch (num) {
		case 0:
			return MediaPlayer.create(getBaseContext(), R.raw.elevenn);
		case 1:
			return MediaPlayer.create(getBaseContext(), R.raw.twilevee);
		case 2:
			return MediaPlayer.create(getBaseContext(), R.raw.threethenn);
		case 3:
			return MediaPlayer.create(getBaseContext(), R.raw.forthenn);
		case 4:
			return MediaPlayer.create(getBaseContext(), R.raw.fivethenn);
		case 5:
			return MediaPlayer.create(getBaseContext(), R.raw.sixthenn);
		case 6:
			return MediaPlayer.create(getBaseContext(), R.raw.sevnthenn);
		case 7:
			return MediaPlayer.create(getBaseContext(), R.raw.eightthenn);
		case 8:
			return MediaPlayer.create(getBaseContext(), R.raw.ninthenn);
		case 9:
			return MediaPlayer.create(getBaseContext(), R.raw.twintyy);
		case 10:
			return MediaPlayer.create(getBaseContext(), R.raw.threetyy);
		case 11:
			return MediaPlayer.create(getBaseContext(), R.raw.fortyy);
		case 12:
			return MediaPlayer.create(getBaseContext(), R.raw.fivetyy);
		case 13:
			return MediaPlayer.create(getBaseContext(), R.raw.sixtyy);
		case 14:
			return MediaPlayer.create(getBaseContext(), R.raw.seventyy);
		case 15:
			return MediaPlayer.create(getBaseContext(), R.raw.eightt);
		case 16:
			return MediaPlayer.create(getBaseContext(), R.raw.nintyy);
		case 17:
			return MediaPlayer.create(getBaseContext(), R.raw.onehann);
		case 18:
			return MediaPlayer.create(getBaseContext(), R.raw.sserpiente);
		case 19:
			return MediaPlayer.create(getBaseContext(), R.raw.svaca);
		}
		return MediaPlayer.create(getBaseContext(), R.raw.svaca);
	}

	public void setImage(ImageButton button, int num) {
		switch (num) {
		case 0:
			button.setImageResource(R.drawable.elevenn);
			break;
		case 1:
			button.setImageResource(R.drawable.twilve);
			break;
		case 2:
			button.setImageResource(R.drawable.therthen);
			break;
		case 3:
			button.setImageResource(R.drawable.forthenn);
			break;
		case 4:
			button.setImageResource(R.drawable.fivethenn);
			break;
		case 5:
			button.setImageResource(R.drawable.sixthenn);
			break;
		case 6:
			button.setImageResource(R.drawable.seventhen);
			break;
		case 7:
			button.setImageResource(R.drawable.eightthenn);
			break;
		case 8:
			button.setImageResource(R.drawable.ninthenn);
			break;
		case 9:
			button.setImageResource(R.drawable.twinty);
			break;
		case 10:
			button.setImageResource(R.drawable.threety);
			break;
		case 11:
			button.setImageResource(R.drawable.forty);
			break;
		case 12:
			button.setImageResource(R.drawable.fivety);
			break;
		case 13:
			button.setImageResource(R.drawable.sixty);
			break;
		case 14:
			button.setImageResource(R.drawable.seventy);
			break;
		case 15:
			button.setImageResource(R.drawable.eighty);
			break;
		case 16:
			button.setImageResource(R.drawable.ninety);
			break;
		case 17:
			button.setImageResource(R.drawable.onehandred);
			break;
		case 18:
			button.setImageResource(R.drawable.sserpiente);
			break;
		case 19:
			button.setImageResource(R.drawable.svaca);
			break;
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			if (mediaPlayer != null)
				mediaPlayer.stop();
			Intent intent = new Intent();
			intent.setClass(this, MenuActivity.class);
			startActivity(intent);
			displayInterstitial();
			this.finish();
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

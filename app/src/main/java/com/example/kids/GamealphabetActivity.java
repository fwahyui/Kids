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

public class GamealphabetActivity extends Activity {
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
		setContentView(R.layout.activity_gamenumbers);
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

		a0 = r.nextInt(26);
		a1 = r.nextInt(26);
		while (a1 == a0) {
			a1 = r.nextInt(26);
		}
		a2 = r.nextInt(26);
		while ((a2 == a0) || (a2 == a1)) {
			a2 = r.nextInt(20);
		}
		a3 = r.nextInt(26);
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
			if(score==20){
				Intent intent = new Intent();
				intent.setClass(this, Gamenumbers2Activity.class);
				startActivity(intent);
			}
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
			if(score==20){
				Intent intent = new Intent();
				intent.setClass(this, Gamenumbers2Activity.class);
				startActivity(intent);
			}
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
			if(score==20){
				Intent intent = new Intent();
				intent.setClass(this, Gamenumbers2Activity.class);
				startActivity(intent);
			}
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
			if(score==20){
				Intent intent = new Intent();
				intent.setClass(this, Gamenumbers2Activity.class);
				startActivity(intent);
			}
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
			return MediaPlayer.create(getBaseContext(), R.raw.aa);
		case 1:
			return MediaPlayer.create(getBaseContext(), R.raw.bb);
		case 2:
			return MediaPlayer.create(getBaseContext(), R.raw.cc);
		case 3:
			return MediaPlayer.create(getBaseContext(), R.raw.dd);
		case 4:
			return MediaPlayer.create(getBaseContext(), R.raw.ee);
		case 5:
			return MediaPlayer.create(getBaseContext(), R.raw.ff);
		case 6:
			return MediaPlayer.create(getBaseContext(), R.raw.gg);
		case 7:
			return MediaPlayer.create(getBaseContext(), R.raw.hh);
		case 8:
			return MediaPlayer.create(getBaseContext(), R.raw.ii);
		case 9:
			return MediaPlayer.create(getBaseContext(), R.raw.jj);
		case 10:
			return MediaPlayer.create(getBaseContext(), R.raw.kk);
		case 11:
			return MediaPlayer.create(getBaseContext(), R.raw.ll);
		case 12:
			return MediaPlayer.create(getBaseContext(), R.raw.mm);
		case 13:
			return MediaPlayer.create(getBaseContext(), R.raw.nn);
		case 14:
			return MediaPlayer.create(getBaseContext(), R.raw.oo);
		case 15:
			return MediaPlayer.create(getBaseContext(), R.raw.pp);
		case 16:
			return MediaPlayer.create(getBaseContext(), R.raw.qq);
		case 17:
			return MediaPlayer.create(getBaseContext(), R.raw.rr);
		case 18:
			return MediaPlayer.create(getBaseContext(), R.raw.ss);
		case 19:
			return MediaPlayer.create(getBaseContext(), R.raw.tt);
		case 20:
			return MediaPlayer.create(getBaseContext(), R.raw.uu);
		case 21:
			return MediaPlayer.create(getBaseContext(), R.raw.vv);
		case 22:
			return MediaPlayer.create(getBaseContext(), R.raw.ww);
		case 23:
			return MediaPlayer.create(getBaseContext(), R.raw.xx);
		case 24:
			return MediaPlayer.create(getBaseContext(), R.raw.yy);
		case 25:
			return MediaPlayer.create(getBaseContext(), R.raw.zz);
		}
		return MediaPlayer.create(getBaseContext(), R.raw.svaca);
	}

	public void setImage(ImageButton button, int num) {
		switch (num) {
		case 0:
			button.setImageResource(R.drawable.a);
			break;
		case 1:
			button.setImageResource(R.drawable.b);
			break;
		case 2:
			button.setImageResource(R.drawable.c);
			break;
		case 3:
			button.setImageResource(R.drawable.d);
			break;
		case 4:
			button.setImageResource(R.drawable.e);
			break;
		case 5:
			button.setImageResource(R.drawable.f);
			break;
		case 6:
			button.setImageResource(R.drawable.g);
			break;
		case 7:
			button.setImageResource(R.drawable.h);
			break;
		case 8:
			button.setImageResource(R.drawable.i);
			break;
		case 9:
			button.setImageResource(R.drawable.j);
			break;
		case 10:
			button.setImageResource(R.drawable.k);
			break;
		case 11:
			button.setImageResource(R.drawable.l);
			break;
		case 12:
			button.setImageResource(R.drawable.m);
			break;
		case 13:
			button.setImageResource(R.drawable.n);
			break;
		case 14:
			button.setImageResource(R.drawable.o);
			break;
		case 15:
			button.setImageResource(R.drawable.p);
			break;
		case 16:
			button.setImageResource(R.drawable.q);
			break;
		case 17:
			button.setImageResource(R.drawable.r);
			break;
		case 18:
			button.setImageResource(R.drawable.s);
			break;
		case 19:
			button.setImageResource(R.drawable.t);
			break;
		case 20:
			button.setImageResource(R.drawable.u);
			break;
		case 21:
			button.setImageResource(R.drawable.v);
			break;
		case 22:
			button.setImageResource(R.drawable.w);
			break;
		case 23:
			button.setImageResource(R.drawable.x);
			break;
		case 24:
			button.setImageResource(R.drawable.y);
			break;
		case 25:
			button.setImageResource(R.drawable.z);
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

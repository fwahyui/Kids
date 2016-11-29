package com.example.kids;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}
	public void alphClick(View view) {
		Intent intent = new Intent(this, AlphabetActivity.class);
		startActivity(intent);
		this.finish();
	}
	public void numbClick(View view) {
		Intent intent = new Intent(this, NumbersActivity.class);
		startActivity(intent);
		this.finish();
	}
	public void BuahClick(View view) {
		Intent intent = new Intent(this, LearningbuahActivity.class);
		startActivity(intent);
		this.finish();
	}
	public void WarnaClick(View view) {
		Intent intent = new Intent(this, Learning_warna_Activity.class);
		startActivity(intent);
		this.finish();
	}
	public void KeluargaClick(View view) {
		Intent intent = new Intent(this, Learning_family_Activity.class);
		startActivity(intent);
		this.finish();
	}
	public void Metu(View view) {
		finish();
		System.exit(0);
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			this.finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}

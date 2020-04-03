package com.example.bankapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DepActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dep);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dep, menu);
		return true;
	}

}

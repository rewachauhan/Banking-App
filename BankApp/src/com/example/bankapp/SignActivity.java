package com.example.bankapp;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SignActivity extends Activity {
	String data,data1,msg,id,pass;
	TextView tv1;
	Button bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign);
		tv1=(TextView) findViewById(R.id.textView2);
		data=getIntent().getStringExtra("ud");
		data1=getIntent().getStringExtra("pw");
		bt=(Button) findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//msg=;
				Intent i1=new Intent();
				i1.putExtra("avg", msg);
				setResult(RESULT_OK, i1);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign, menu);
		return true;
	}

}

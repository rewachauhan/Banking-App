package com.example.bankapp;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NextActivity extends Activity {
	Button b1,b2,b3,b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);
		 b1=(Button) findViewById(R.id.button1);
	     b2=(Button) findViewById(R.id.button2);
	     b3=(Button) findViewById(R.id.button3);
	     b4=(Button) findViewById(R.id.button4);
	     b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(NextActivity.this,DepActivity.class);
				
				startActivity(i);
			}
		});
	     b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(NextActivity.this,WithActivity.class);
				
				startActivity(i);
			}
		});
	     b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(NextActivity.this,BookActivity.class);
				
				startActivity(i);				
			}
		});
	     b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(NextActivity.this,PassActivity.class);
				
				startActivity(i);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next, menu);
		return true;
	}

}

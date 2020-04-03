package com.example.bankapp;

import android.os.Bundle;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PassActivity extends Activity {
	EditText p1,p2;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pass);
		p1=(EditText) findViewById(R.id.editText1);
        p2=(EditText) findViewById(R.id.editText2);
      
        
        b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String pass1,pass2;
				pass1=p1.getText().toString();
				pass2=p2.getText().toString();
				
				SQLiteDatabase mydatabase= openOrCreateDatabase("mydb.dat",MODE_PRIVATE,null);
				mydatabase.execSQL("UPDATE Bank Set Password='"+pass2+"' where Password='"+pass1+"';");
				Toast.makeText(getApplicationContext(), "Updated Successfully", Toast.LENGTH_LONG).show();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pass, menu);
		return true;
	}

}

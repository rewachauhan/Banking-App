package com.example.bankapp;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends Activity {
	EditText uid,pwd,dep;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		uid=(EditText) findViewById(R.id.editText1);
        pwd=(EditText) findViewById(R.id.editText2);
        dep=(EditText) findViewById(R.id.editText3);
        b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ud,pw,dp;
				ud=uid.getText().toString();
				pw=pwd.getText().toString();
				dp=dep.getText().toString();
				
				SQLiteDatabase mydatabase = openOrCreateDatabase("mydb.dat",MODE_PRIVATE,null);
				mydatabase.execSQL("CREATE TABLE IF NOT EXISTS Bank(Username VARCHAR Primary Key,Password VARCHAR,Deposit Integer);");
				mydatabase.execSQL("INSERT INTO Bank VALUES('"+ud+"','"+pw+"','"+dp+"');");
				Toast.makeText(getApplicationContext(),"Data Inserted Successfully" , Toast.LENGTH_LONG).show();
				String data="";
				Cursor c=mydatabase.rawQuery("SELECT * FROM Bank", null);
				c.moveToFirst();
				while(!c.isAfterLast())
				{
					data+=c.getString(0)+"      "+c.getString(1)+"\n";
					c.moveToNext();
				}
				Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();
				c.close();
			}
			
		});
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add, menu);
		return true;
	}

}

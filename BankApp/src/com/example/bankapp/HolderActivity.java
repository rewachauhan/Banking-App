package com.example.bankapp;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HolderActivity extends Activity {
	private static final int REQUEST_CODE_HOLDERACTIVITY = 100;
	EditText uid,pwd;
	Button b1;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_holder);
		uid=(EditText) findViewById(R.id.editText1);
        pwd=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button1);

        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ud,pw;
				ud=uid.getText().toString();
				pw=pwd.getText().toString();
				Intent i=new Intent(HolderActivity.this,SignActivity.class);
				i.putExtra("id", ud);
				i.putExtra("pass", pw);
				startActivityForResult(i,REQUEST_CODE_HOLDERACTIVITY);
				Intent i2=new Intent(HolderActivity.this,NextActivity.class);
				startActivity(i2);
				
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		String mesg;
		tv=(TextView) findViewById(R.id.textView3);
		if(requestCode==REQUEST_CODE_HOLDERACTIVITY)
		{
			if(resultCode==RESULT_OK)
			{
				mesg=data.getStringExtra("avg");
				tv.setText(mesg);
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.holder, menu);
		return true;
	}

}

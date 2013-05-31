package com.delta.task1;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	Button b;
	EditText et;
	TextView tv;
	String s;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b = (Button) findViewById(R.id.button1);
		et = (EditText) findViewById(R.id.editText1);
		tv = (TextView) findViewById(R.id.textView2);
		b.setOnClickListener(this);

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	// The Button Click Listener
	public void onClick(View arg0) {

		if (arg0.getId() == R.id.button1) {
			s = et.getText().toString();
			int len = s.length() - 1;
			char[] ca = s.toCharArray();
			StringBuilder sb = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i <= len; i++) {
				char c = ca[random.nextInt(ca.length)]; // to generate a random character from the entered string.
				sb.append(c);
			}
			String output = sb.toString();
			tv.setText(output);
		}
	}

}

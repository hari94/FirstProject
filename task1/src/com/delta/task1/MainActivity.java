package com.delta.task1;

import java.util.ArrayList;
import java.util.List;

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
String s1,s2=" ";
int x,len;
//char[] a;
//char s;
ArrayList<Character> a=new ArrayList<Character>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b=(Button)findViewById(R.id.button1);
		et=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView2);
		s1=et.getText().toString();
		len=s1.length();
		/*char[] arr=s1.toCharArray();
	
		
		
		for(int i=0;i<len;i++){
			//x=(int) (Math.random()%len);
			a[i]=arr[len-i];
						
			
		}*/
		b.setOnClickListener(this);
		
	}

	




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}



	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.button1){
		
		tv.setText(s1);
		}
	}

}

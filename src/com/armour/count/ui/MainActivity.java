package com.armour.count.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.armour.count.R;

public class MainActivity extends Activity {
	private EditText input=null;
	
	private Button  one=null;
	private Button  two=null;
	private Button  three=null;
	private Button  four=null;
	private Button  five=null;
	private Button  six=null;
	private Button  seven=null;
	private Button  eight=null;
	private Button  nine=null;
	
	private Button  add=null;
	private Button  sub=null;
	private Button  mul=null;
	private Button  div=null;
	private Button  equal=null;
	
	private static String fistNumber = "0";// 第一次输入的值  
    private static String secondNumber = "0";// 第二次输入的值  
    private static String num = "0";// 显示的结果  
    private static int flg = 0;// 结果累加一次  

	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		input=(EditText)findViewById(R.id.input);
		input.setText("0");
		
		one=(Button)findViewById(R.id.yi);
		two=(Button)findViewById(R.id.er);
		three=(Button)findViewById(R.id.san);
		four=(Button)findViewById(R.id.si);
		five=(Button)findViewById(R.id.wu);
		six=(Button)findViewById(R.id.liu);
		seven=(Button)findViewById(R.id.qi);
		eight=(Button)findViewById(R.id.ba);
		nine=(Button)findViewById(R.id.jiu);
		
		add=(Button)findViewById(R.id.add);
		sub=(Button)findViewById(R.id.sub);
		mul=(Button)findViewById(R.id.chen);
		div=(Button)findViewById(R.id.clears);
		equal=(Button)findViewById(R.id.deng);
		
		
		
		one.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				input.setText("1");
			}
		});
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
   
}

 



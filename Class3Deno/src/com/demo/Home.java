package com.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Home extends Activity{

	
	Button btn_navigate;
	Button btn_view;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); 
        
        btn_navigate=(Button)findViewById(R.id.btn_navigate);
        
        btn_navigate.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				
				Intent i = new Intent(Home.this,Class3DenoActivity.class);
				
				startActivity(i);
				
				
			}
		});
        
        
        btn_view=(Button) findViewById(R.id.btn_view);
        
        btn_view.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				
	Toast.makeText(Home.this, "Welcome to Home Page", Toast.LENGTH_LONG).show();
			 
				
			}
		});
        
        
        	
    }
    
    
    
}

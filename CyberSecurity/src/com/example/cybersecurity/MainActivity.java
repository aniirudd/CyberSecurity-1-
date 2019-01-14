package com.example.cybersecurity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
ImageView imageView;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.imageView1);
       // Toast.makeText(this, "Welcome in cyber sequrity world", Toast.LENGTH_LONG).show();
        b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent b1 = new Intent(getApplicationContext(),First.class);
				startActivity(b1);
			}
		});
        
        
        
    }
   
	
		
	}

	

    
    

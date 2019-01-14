package com.example.cybersecurity;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class First extends Activity  {
	Button b1,b2,b3,b5,b6;
	ImageButton b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		 
		 b1=(Button) findViewById(R.id.button1);
		 b2=(Button) findViewById(R.id.button2);
		 b3=(Button) findViewById(R.id.button3);
		 b4=(ImageButton) findViewById(R.id.ib1);
		 b5=(Button) findViewById(R.id.ITACT);
		 b6=(Button) findViewById(R.id.study);
		 //Toast.makeText(getApplication(), "select anyoption", Toast.LENGTH_LONG).show();
		 b4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					//Toast.makeText(getApplicationContext(), "Basic", Toast.LENGTH_LONG).show();
					Intent a= new Intent(getApplicationContext(),About.class);
					startActivity(a);
				}
			});
		 b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					//Toast.makeText(getApplicationContext(), "Basic", Toast.LENGTH_LONG).show();
					Intent a= new Intent(getApplicationContext(),Basic.class);
					startActivity(a);
				}
			});
		 b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent b = new Intent(getApplicationContext(),Medium.class);
					startActivity(b);
					//Toast.makeText(getApplication(), "medium", Toast.LENGTH_LONG).show();
					
				}
			});
		 b3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent c = new Intent(getApplicationContext(),Advance.class);
					startActivity(c);
					
					//Toast.makeText(getApplication(), "Advance", Toast.LENGTH_LONG).show();
				}
			});
		 b5.setOnClickListener(new OnClickListener() {
				
			 	
			 	@Override
			 	public void onClick(View v)
			 	{
			 		// TODO Auto-generated method stub
			 		PopupMenu pop=new PopupMenu(getApplicationContext(),v);
			 		pop.getMenuInflater().inflate(R.menu.itact
			 				, pop.getMenu());
			 		pop.show();
			 		
			 		pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
			 		{
			 			
			 			@Override
			 			public boolean onMenuItemClick(MenuItem item) {
			 				
			 				if(R.id.it1==item.getItemId())
			 				{
			 					//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
			 					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.eprocurement.gov.in/news/Act2008.pdf ")));
			 				}
			 				
			 				if(R.id.it2==item.getItemId())
			 				{
			 					//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
			 					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://unpan1.un.org/intradoc/groups/public/documents/apcity/unpan010239.pdf")));
			 				}
			 				
			 				
			 				return false;
			 			}
			 		});
			 	}

			  });
		 

		 b6.setOnClickListener(new OnClickListener() {
			
			 	
			 	@Override
			 	public void onClick(View v)
			 	{
			 		// TODO Auto-generated method stub
			 		PopupMenu pop=new PopupMenu(getApplicationContext(),v);
			 		pop.getMenuInflater().inflate(R.menu.studycases
			 				, pop.getMenu());
			 		pop.show();
			 		
			 		pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
			 		{
			 			
			 			@Override
			 			public boolean onMenuItemClick(MenuItem item) {
			 				
			 				if(R.id.studyt1==item.getItemId())
			 				{
			 					//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
			 					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://gurgaon.haryanapolice.gov.in/cyber-crime.htm")));
			 				}
			 				
			 				if(R.id.studyt3==item.getItemId())
			 				{
			 					//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
			 					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cert-in.org.in/")));
			 				}
			 				if(R.id.studyt4==item.getItemId())
			 				{
			 					//Toast.makeText(getApplicationContext(), "t4", Toast.LENGTH_LONG).show();
			 					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cyberswachhtakendra.gov.in/security-tools.html")));
			 				}
			 				
			 				return false;
			 			}
			 		});
			 	}

			  });
		 
	}

	

}

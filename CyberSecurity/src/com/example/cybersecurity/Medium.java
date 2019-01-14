package com.example.cybersecurity;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Medium extends Activity {
Button bm1,bm2,bm3,bm4,bm5,back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_medium);
		//Toast.makeText(this, "medium", Toast.LENGTH_LONG).show();
		bm1=(Button) findViewById(R.id.buttonm1);
		bm2=(Button) findViewById(R.id.buttonm2);
		bm3=(Button) findViewById(R.id.buttonm3);
		bm4=(Button) findViewById(R.id.buttonm4);
		bm5=(Button) findViewById(R.id.intel);
		back=(Button) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_LONG).show();
				Intent a= new Intent(getApplicationContext(),First.class);
				startActivity(a);
			}
		});
		bm1.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_medium
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						if(R.id.tm1==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pipl.com/")));
						}
						
						if(R.id.tm3==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.peekyou.com/")));
						}
						
						
						return false;
					}
				});
			}

		 });
		bm2.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_medium1
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						
						if(R.id.tm6==item.getItemId())
						{
						//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.truecaller.com/")));
						}
						
						
						return false;
					}
				});
			}

		 });
		bm3.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_medium2
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						if(R.id.tm9==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://tineye.com/")));
						}
						if(R.id.tm10==item.getItemId())
						{
						//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imageidentify.com/")));
						}
						if(R.id.tm11==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://exif.regex.info/exif.cgi")));
						}
						
						
						return false;
					}
				});
			}

		 });
		bm4.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_medium3
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						if(R.id.tm13==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://citizenevidence.amnestyusa.org/")));
						}
						if(R.id.tm14==item.getItemId())
						{
						//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://tools.digitalmethods.net/netvizz/youtube/")));
						}
						if(R.id.tm15==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.insecam.org/en/bycountry/IN/")));
						}
					
						
						return false;
					}
				});
			}

		 });
		 bm5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					//Toast.makeText(getApplicationContext(), "Basic", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://inteltechniques.com/menu.html")));
				}
			});
	}

	

}

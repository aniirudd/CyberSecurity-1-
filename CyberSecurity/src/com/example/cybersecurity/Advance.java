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

public class Advance extends Activity {
Button ba1,ba2,ba3,ba4,ba5,back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_advance);
		//Toast.makeText(this, "advance", Toast.LENGTH_LONG).show();
		ba1=(Button) findViewById(R.id.buttona1);
		ba2=(Button) findViewById(R.id.buttona2);
		ba3=(Button) findViewById(R.id.buttona3);
		ba4=(Button) findViewById(R.id.buttona4);
		ba5=(Button) findViewById(R.id.buttona5);
		back=(Button) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_LONG).show();
				Intent a= new Intent(getApplicationContext(),First.class);
				startActivity(a);
			}
		});
		ba1.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_advance
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						if(R.id.ta1==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://online-barcode-reader.inliteresearch.com/")));
						}
						if(R.id.ta2==item.getItemId())
						{
						//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://gchq.github.io/CyberChef/")));
						}
						if(R.id.ta3==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.functions-online.com/")));
						}
						
						
						return false;
					}
				});
			}

		 });
		ba2.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_advance1
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						if(R.id.ta5==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.virustotal.com/#/home/upload")));
						}
						if(R.id.ta6==item.getItemId())
						{
						//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.joesandbox.com/")));
						}
						if(R.id.ta7==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hybrid-analysis.com/")));
						}
						if(R.id.ta8==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t4", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://sandbox.pikker.ee/")));
						}
						
						return false;
					}
				});
			}

		 });
		ba3.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_advance2
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						if(R.id.ta9==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://exchange.xforce.ibmcloud.com/")));
						}
						if(R.id.ta10==item.getItemId())
						{
						//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.phishtank.com/")));
						}
						if(R.id.ta11==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://cymon.io/")));
						}
						
					
						return false;
					}
				});
			}

		 });
		ba4.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				PopupMenu pop=new PopupMenu(getApplicationContext(),v);
				pop.getMenuInflater().inflate(R.menu.activity_advance3
						, pop.getMenu());
				pop.show();
				
				pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
				{
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						
						if(R.id.ta13==item.getItemId())
						{
							//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.toolsley.com/")));
						}
						if(R.id.ta14==item.getItemId())
						{
						//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
							startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://fotoforensics.com/")));
						}
						
						return false;
					}
				});
			}

		 });
		ba5.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v)
			{
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nomoreransom.org/en/decryption-tools.html")));
			}

		 });
	}

	

}

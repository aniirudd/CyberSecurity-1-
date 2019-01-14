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

public class Basic extends Activity 
{
Button bb1,bb2,bb3,bb4,bb5,bb6,bb7,back;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic);
		//Toast.makeText(this, "basic", Toast.LENGTH_LONG).show();
		bb1=(Button) findViewById(R.id.buttonb1);
		bb2=(Button) findViewById(R.id.buttonb2);
		bb3=(Button) findViewById(R.id.buttonb3);
		bb4=(Button) findViewById(R.id.buttonb4);
		bb5=(Button) findViewById(R.id.buttonb5);
		bb6=(Button) findViewById(R.id.buttonb6);
		bb7=(Button) findViewById(R.id.buttonb7);
		back=(Button) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_LONG).show();
				Intent a= new Intent(getApplicationContext(),First.class);
				startActivity(a);
			}
		});
bb1.setOnClickListener(new OnClickListener() 
{
	
	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		PopupMenu pop=new PopupMenu(getApplicationContext(),v);
		pop.getMenuInflater().inflate(R.menu.activity_basic
				, pop.getMenu());
		pop.show();
		
		pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
		{
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				
				if(R.id.tb1==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://en.utrace.de/")));
				}
				if(R.id.tb2==item.getItemId())
				{
				//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://cqcounter.com/whois/")));
				}
				if(R.id.tb3==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ipfingerprints.com/")));
				}
				
				
				return false;
			}
		});
	}

 });
bb2.setOnClickListener(new OnClickListener() 
{
	
	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		PopupMenu pop=new PopupMenu(getApplicationContext(),v);
		pop.getMenuInflater().inflate(R.menu.activity_basic1
				, pop.getMenu());
		pop.show();
		
		pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
		{
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				
				if(R.id.tb5==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://centralops.net/co/DomainDossier.aspx")));
				}
				if(R.id.tb8==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t4", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://dnsviz.net/")));
				}
				
				return false;
			}
		});
	}

 });
bb3.setOnClickListener(new OnClickListener() 
{
	
	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		PopupMenu pop=new PopupMenu(getApplicationContext(),v);
		pop.getMenuInflater().inflate(R.menu.activity_basic2
				, pop.getMenu());
		pop.show();
		
		pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
		{
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				
				if(R.id.tb9==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://email-verifier.online-domain-tools.com/ ")));
				}
				if(R.id.tb10==item.getItemId())
				{
				//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://everifier.org/ ")));
				}
				
				
				
				return false;
			}
		});
	}

 });
bb4.setOnClickListener(new OnClickListener() 
{
	
	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		PopupMenu pop=new PopupMenu(getApplicationContext(),v);
		pop.getMenuInflater().inflate(R.menu.activity_basic3
				, pop.getMenu());
		pop.show();
		
		pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
		{
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				
				if(R.id.tb12==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t1", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mxtoolbox.com/EmailHeaders.aspx")));
				}
				if(R.id.tb13==item.getItemId())
				{
				//	Toast.makeText(getApplicationContext(), "t2", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://toolbox.googleapps.com/apps/messageheader/")));
				}
				if(R.id.tb14==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t3", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://testconnectivity.microsoft.com/MHA/Pages/mha.aspx")));
				}
				if(R.id.tb15==item.getItemId())
				{
					//Toast.makeText(getApplicationContext(), "t4", Toast.LENGTH_LONG).show();
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cyberforensics.in/(A(1u3GIaPVzgEkAAAAOGE2NDg2OGUtYTBjNi00YTQxLWJiOTItOGE1MTdkYzlmZmE0L5iiNO28uQkt1qtDibzLDCUOtH01))/OnlineEmailTracer/index.aspx?AspxAutoDetectCookieSupport=1")));
				}
				
				return false;
			}
		});
	}

 });
bb5.setOnClickListener(new OnClickListener() 
{
	
	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://archive.org/web/")));
	}

 });
bb6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nirsoft.net/utils/")));
	}
});
bb7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.imei.info/")));
	}
});
}

	
}
		





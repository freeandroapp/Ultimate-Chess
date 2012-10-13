package com.chess.android.appdevthree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageButton;
import com.chess.android.appdevthree.R;

//import com.airpush.android.Airpush;

public class FirstScreen extends Activity {

	private ImageButton btn_newgame;
	private ImageButton btn_exit;
	private ImageButton btn_help;
	
	public static final int DIALOG_HELP = 1;

	@Override
	protected Dialog onCreateDialog(int id)
	{
		Dialog dlg = null;
		switch (id) 
		{
			case DIALOG_HELP:
	            AlertDialog.Builder builder = new AlertDialog.Builder(this);
	            String title = getString(R.string.app_name);
	            WebView wv = new WebView(this);
	            builder.setView(wv);
	            String data = "";
	            try {
	                InputStream is = getResources().openRawResource(R.raw.about);
	                InputStreamReader isr = new InputStreamReader(is, "UTF-8");
	                BufferedReader br = new BufferedReader(isr);
	                StringBuilder sb = new StringBuilder();
	                String line;
	                while ((line = br.readLine()) != null) {
	                    sb.append(line);
	                    sb.append('\n');
	                }
	                br.close();
	                data = sb.toString();
	            } catch (UnsupportedEncodingException e1) {
	            } catch (IOException e) {
	            }
	            System.out.printf("%.3f DroidFish.onCreateDialog(): data:%s\n",
	                    System.currentTimeMillis() * 1e-3, data);
	            wv.loadDataWithBaseURL(null, data, "text/html", "utf-8", null);
	            try {
	                PackageInfo pi = getPackageManager().getPackageInfo("com.chess.android.appdevthree", 0);
	                title += " " + pi.versionName;
	            } catch (NameNotFoundException e) {
	            }
	            builder.setTitle(title);
	            AlertDialog alert = builder.create();
	            return alert;
		}
		
		return dlg;
	}
	
	public void onCreate(Bundle savedInstanceState) {
		final Context context = this;
 		super.onCreate(savedInstanceState);
 		requestWindowFeature(Window.FEATURE_NO_TITLE);
//		new Airpush(this, "64347","1344361783110253840",false,true,true);
		
		setContentView(R.layout.first_screen);
 
		btn_newgame = (ImageButton) findViewById(R.id.btn_newgame);
		btn_exit = (ImageButton) findViewById(R.id.btn_exit);
		btn_help = (ImageButton) findViewById(R.id.btn_help);
		
		
		btn_newgame.setOnClickListener(new OnClickListener() {
			 
			  @Override
			  public void onClick(View arg0) {
			    Intent intent = new Intent(context, DroidFish.class);
			    startActivity(intent);
			  }
	 
			});
	

		btn_help.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg0){
				showDialog(DIALOG_HELP);
			}
		});

		btn_exit.setOnClickListener(new OnClickListener() {
			 
			  @Override
			  public void onClick(View arg0) {
			    finish();
			  }
	 
			});		 
	}
}

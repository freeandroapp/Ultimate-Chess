package com.chess.android.appdevthree;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.chess.android.appdevthree.R;

//import com.airpush.android.Airpush;

public class BootReceiver extends BroadcastReceiver {
			    	@Override
			    	public void onReceive(Context arg0, Intent arg1) {
			    		// TODO Auto-generated method stub
			    		if(Integer.parseInt(VERSION.SDK) > 3){
//			    	new Airpush(arg0, "64347","1344361783110253840",false,true,true);
			    		}
	}

}

package com.justai.aimybox.assistant;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    Intent in;
    @Override
    public void onReceive(Context context, Intent intent) {
        in=new Intent(context,GPSTracker.class);
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            boolean notconnected=intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false);
            if (notconnected){
                Toast.makeText(context,"Disconnected",Toast.LENGTH_LONG).show();
                context.stopService(in);
            }
            else {
                context.startService(in);
            }
        }
    }
}

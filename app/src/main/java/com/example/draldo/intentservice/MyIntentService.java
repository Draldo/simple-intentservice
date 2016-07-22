package com.example.draldo.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.StrictMode;
import android.util.Log;


public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentServiceTAG_";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + Thread.currentThread());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent: " + Thread.currentThread());
    }

}

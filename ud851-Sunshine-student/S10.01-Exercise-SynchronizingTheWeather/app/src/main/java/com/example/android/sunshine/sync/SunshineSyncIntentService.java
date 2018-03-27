
package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;

//Completed: TODO(5) Create a new class called SunshineSyncIntentService that extends IntentService

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 */
public class SunshineSyncIntentService extends IntentService {

    //Completed: TODO(6) Create a constructor that calls super and passes the name of this class
    public SunshineSyncIntentService() {
        super("SunshineSyncIntentService");
    }

    //Completed: TODO (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
    @Override
    protected void onHandleIntent(Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}
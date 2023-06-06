package com.yahayaessa.finalucassocialmedia;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class GeneralApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);

    }
}

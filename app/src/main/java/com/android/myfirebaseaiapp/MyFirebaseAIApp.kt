package com.android.myfirebaseaiapp

import android.app.Application
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyFirebaseAIApp : Application() {
    override fun onCreate() {
        super.onCreate()
        //Firebase is initialized
        FirebaseApp.initializeApp(this)
    }
}

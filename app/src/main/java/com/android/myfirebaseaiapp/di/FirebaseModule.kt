package com.android.myfirebaseaiapp.di

import android.app.Application
import com.google.firebase.FirebaseApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {

    @Provides
    @Singleton
    fun provideFirebaseApp(app: Application): FirebaseApp {
        return FirebaseApp.getInstance() ?: FirebaseApp.initializeApp(app)!!
    }
}
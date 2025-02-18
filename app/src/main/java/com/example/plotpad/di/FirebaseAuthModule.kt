package com.example.plotpad.di

import com.example.plotpad.data.firebase.FirebaseService
import com.example.plotpad.data.firebase.FirebaseServiceImpl
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FirebaseAuthModule {
    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }


    @Provides
    @Singleton
    fun provideFirebaseService(firebaseAuth: FirebaseAuth): FirebaseService {
        return FirebaseServiceImpl(firebaseAuth)
    }
}
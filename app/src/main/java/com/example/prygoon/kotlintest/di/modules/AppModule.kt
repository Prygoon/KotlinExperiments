package com.example.prygoon.kotlintest.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val application: Application) {

    @Provides
    fun provideApplicationContext() = application
}

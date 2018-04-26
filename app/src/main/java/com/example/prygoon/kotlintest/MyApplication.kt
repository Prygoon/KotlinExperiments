package com.example.prygoon.kotlintest

import android.app.Application
import com.example.prygoon.kotlintest.di.AppComponent
import com.example.prygoon.kotlintest.di.DaggerAppComponent

class MyApplication : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}
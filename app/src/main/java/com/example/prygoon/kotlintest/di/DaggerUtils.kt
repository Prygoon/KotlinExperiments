package com.example.prygoon.kotlintest.di

import android.support.v7.app.AppCompatActivity
import com.example.prygoon.kotlintest.MyApplication
import com.example.prygoon.kotlintest.di.modules.BaseModule

/*
val AppCompatActivity.component: AppComponent
    get() = (application as MyApplication).component
*/

val AppCompatActivity.database: BaseComponent
    get() = (application as MyApplication).component.plus(BaseModule(this))

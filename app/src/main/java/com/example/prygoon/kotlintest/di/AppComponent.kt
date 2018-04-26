package com.example.prygoon.kotlintest.di

import com.example.prygoon.kotlintest.MyApplication
import com.example.prygoon.kotlintest.di.modules.AppModule
import com.example.prygoon.kotlintest.di.modules.BaseModule
import dagger.Component

@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(app: MyApplication)

    fun plus (baseModule: BaseModule): BaseComponent
}
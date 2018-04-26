package com.example.prygoon.kotlintest.di

import com.example.prygoon.kotlintest.MainActivity
import com.example.prygoon.kotlintest.di.modules.BaseModule
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Subcomponent(modules = [(BaseModule::class)])
interface BaseComponent {
    fun inject (activity: MainActivity)
}
package com.example.prygoon.kotlintest.di.modules

import android.content.Context
import com.example.prygoon.kotlintest.DBHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseModule(private val context: Context) {

    @Provides
    @Singleton
    fun providesDBHelper(): DBHelper = DBHelper(context)
}
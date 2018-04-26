package com.example.prygoon.kotlintest


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prygoon.kotlintest.di.database
import com.example.prygoon.kotlintest.model.PurchaseSection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
        @Inject lateinit var db: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //component.inject(this)
        database.inject(this)

        db.addPurchaseSection(db, PurchaseSection("Not a Not a Курица"))


        val text: TextView = findViewById(R.id.text)
        var str = ""
        for (element in db.getPurchaseSection(db)) {
           str = str.plus(element).plus(" ")
        }
        text.text = str
    }

}

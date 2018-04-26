package com.example.prygoon.kotlintest

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.prygoon.kotlintest.model.PurchaseSection
import org.jetbrains.anko.db.*

class DBHelper(context: Context) : ManagedSQLiteOpenHelper(context, "DBname", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {

        db.createTable(PurchaseSection.TABLE_NAME, true,
                PurchaseSection.SECTION_ID to INTEGER + PRIMARY_KEY + UNIQUE,
                PurchaseSection.SECTION_NAME to TEXT + NOT_NULL)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.dropTable(PurchaseSection.TABLE_NAME, true)
        onCreate(db)
    }

    fun addPurchaseSection(db: ManagedSQLiteOpenHelper, purchaseSection: PurchaseSection) {
        db.use {
            insert(PurchaseSection.TABLE_NAME,
                    PurchaseSection.SECTION_NAME to purchaseSection.name)
        }
    }

    fun getPurchaseSection(db: ManagedSQLiteOpenHelper): List<String> {
        return db.use {
            select(PurchaseSection.TABLE_NAME, PurchaseSection.SECTION_NAME).exec {
                parseList(StringParser)
            }
        }

    }
}
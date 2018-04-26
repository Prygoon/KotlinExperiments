package com.example.prygoon.kotlintest.model

data class PurchaseSection(val name: String) {
    companion object {
        const val TABLE_NAME = "PurchaseSection"
        const val SECTION_ID = "_id"
        const val SECTION_NAME = "name"
    }
}
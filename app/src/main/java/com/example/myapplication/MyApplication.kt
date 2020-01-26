package com.example.myapplication

import android.app.Application
import androidx.room.Room
import com.example.myapplication.data.database.AppDatabase

class MyApplication : Application() {

    private lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()

//        database = Room
//            .databaseBuilder(applicationContext, AppDatabase::class.java, "database")
//            .build()
    }

    fun getDatabase(): AppDatabase =
        database
}
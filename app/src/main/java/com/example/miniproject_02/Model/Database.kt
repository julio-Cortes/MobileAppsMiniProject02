package com.example.miniproject_02.Model

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Contact::class], version= 1, exportSchema = false)

abstract class AppDatabase: RoomDatabase() {
    abstract fun contactDao(): ContactDao
}
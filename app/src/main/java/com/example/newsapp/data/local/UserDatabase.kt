package com.example.newsapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.newsapp.data.models.User

@Database(entities = [User::class], version = 3)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}
package com.example.newsapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.newsapp.data.models.User

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insertUser(user: User): Long?

}
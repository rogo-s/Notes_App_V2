package com.rogo.ch4.data.local.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.rogo.ch4.data.local.database.entity.User

@Dao
interface UserDAO {


    @Query("SELECT * FROM table_user WHERE email = :email AND password = :password")
    fun verifyUser(email : String, password : String): LiveData<User>

    @Insert
    fun insertUser(user: User)
}
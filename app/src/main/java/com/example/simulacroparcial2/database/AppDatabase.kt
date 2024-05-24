package com.example.simulacroparcial2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.simulacroparcial2.entities.Mascota

@Database(entities = [Mascota::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun mascotaDao() : mascotaDao

    companion object {
        var INSTANCE : AppDatabase? = null

        fun getAppDatabase(context : Context): AppDatabase? {
            if(INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        name = "mascotasDB"
                    ).allowMainThreadQueries().build()
                }
            }

            return INSTANCE
        }
    }
}
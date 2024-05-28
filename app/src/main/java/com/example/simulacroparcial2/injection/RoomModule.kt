package com.example.simulacroparcial2.injection

import android.content.Context
import androidx.room.Room
import com.example.simulacroparcial2.database.AppDatabase
import com.example.simulacroparcial2.database.mascotaDao
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val MASCOTAS_DB_NAME = "mascotasDB"

    @Singleton
    @Provides
    fun provideRoomDatabase(@ApplicationContext context : Context) = Room.databaseBuilder(context, AppDatabase::class.java, MASCOTAS_DB_NAME).build()

    @Singleton
    @Provides
    fun provideMascotaDao(db: AppDatabase) = db.mascotaDao()

}
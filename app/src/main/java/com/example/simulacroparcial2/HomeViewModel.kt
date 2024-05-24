package com.example.simulacroparcial2

import android.content.Context
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simulacroparcial2.database.AppDatabase
import com.example.simulacroparcial2.database.mascotaDao
import com.example.simulacroparcial2.entities.Mascota

class HomeViewModel(
    //private var context: Context
) : ViewModel() {
    //private var db: AppDatabase? = null
    //private var mascotaDao : mascotaDao? = null
    //private lateinit var mascotas : MutableLiveData<Mascota>

    fun onCreate(){
        // db = AppDatabase.getAppDatabase(context)
        // mascotaDao = db?.mascotaDao()
        // db = AppDatabase.getAppDatabase(this)

    }
}
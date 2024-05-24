package com.example.simulacroparcial2

import android.content.Context
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simulacroparcial2.database.AppDatabase
import com.example.simulacroparcial2.database.mascotaDao
import com.example.simulacroparcial2.entities.Mascota

class HomeViewModel(

) : ViewModel() {
    private lateinit var mascotas : MutableLiveData<Mascota>

    fun onCreate(){


    }
}
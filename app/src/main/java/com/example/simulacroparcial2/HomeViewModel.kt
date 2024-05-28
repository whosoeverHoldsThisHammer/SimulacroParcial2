package com.example.simulacroparcial2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simulacroparcial2.entities.Mascota
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository : MascotaRepo
) : ViewModel() {

    //private lateinit var mascotas : MutableLiveData<Mascota>
    val name = MutableLiveData<String>()

    fun changeName() = viewModelScope.launch {
        val mascota = repository.getMascota(1)
        name.postValue(mascota?.nombre.toString())
        Log.e("Mascota desde viewModel", mascota?.nombre.toString())
    }
}
package com.example.simulacroparcial2

import com.example.simulacroparcial2.database.mascotaDao
import com.example.simulacroparcial2.entities.Mascota
import javax.inject.Inject

class MascotaRepo @Inject constructor(
    private val mascotaDao : mascotaDao
) {
    suspend fun getAllMascotas(): MutableList<Mascota?>? {
        return mascotaDao.loadAllMascotas()
    }

    suspend fun getMascota(id: Int): Mascota? {
        return mascotaDao.loadMascotaById(id)
    }
}
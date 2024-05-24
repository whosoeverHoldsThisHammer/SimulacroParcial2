package com.example.simulacroparcial2.database

import androidx.room.*
import com.example.simulacroparcial2.entities.Mascota

@Dao
interface mascotaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMascota(mascota: Mascota)

    @Update
    fun updateMascota(mascota: Mascota)

    @Delete
    fun delete(mascota: Mascota)

    @Query("SELECT * FROM mascotas ORDER BY id")
    fun loadAllMascotas(): MutableList<Mascota?>?

    @Query("SELECT * FROM mascotas WHERE id = :id")
    fun loadMascotaById(id: Int): Mascota?
}
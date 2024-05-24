package com.example.simulacroparcial2.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "mascotas")
class Mascota (id: Int, nombre : String, raza : String, subraza : String, sexo: String, edad: Int, peso: Int, duenio: String, ubicacion: String, descripcion: String, foto : String) {

    @PrimaryKey
    @ColumnInfo(name = "id")
    var id : Int

    @ColumnInfo(name = "nombre")
    var nombre : String

    @ColumnInfo(name = "raza")
    var raza : String

    @ColumnInfo(name = "subraza")
    var subraza : String

    @ColumnInfo(name = "edad")
    var edad : Int

    @ColumnInfo(name = "sexo")
    var sexo : String

    @ColumnInfo(name = "peso")
    var peso : Int

    @ColumnInfo(name = "duenio")
    var duenio : String

    @ColumnInfo(name = "descripcion")
    var descripcion : String

    @ColumnInfo(name = "ubicacion")
    var ubicacion : String

    @ColumnInfo(name = "foto")
    var foto : String

    init {
        this.id = id
        this.nombre = nombre
        this.raza = raza
        this.subraza = subraza
        this.edad = edad
        this.sexo = sexo
        this.peso = peso
        this.duenio = duenio
        this.ubicacion = ubicacion
        this.descripcion = descripcion
        this.foto = foto
    }

}
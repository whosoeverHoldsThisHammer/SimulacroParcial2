package com.example.simulacroparcial2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.simulacroparcial2.database.AppDatabase
import com.example.simulacroparcial2.database.mascotaDao
import com.example.simulacroparcial2.entities.Mascota


class Home : Fragment() {

    private lateinit var view : View
    private lateinit var testBtn : Button

    private var db: AppDatabase? = null
    private var mascotaDao : mascotaDao? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false)


        db = AppDatabase.getAppDatabase(view.context)
        mascotaDao = db?.mascotaDao()

        val mascota = Mascota(1, "Sultan", "Pastor", "Aleman", "macho", 4, 40, "Juan", "CABA", "Un perro policía", "foto")
        mascotaDao?.insertMascota(mascota)


        testBtn = view.findViewById(R.id.testBtn)
        val nombre : TextView = view.findViewById(R.id.nombre_mascota)

        testBtn.setOnClickListener(){
            Log.e("Test", "TestDB")

            val sultan = mascotaDao?.loadMascotaById(1)

            Log.e("Test", sultan?.nombre.toString())

            nombre.text = sultan?.nombre.toString()
        }


        return view
    }

    override fun onStart(){
        super.onStart()


    }

}
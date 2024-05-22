package com.example.simulacroparcial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Publicacion : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        requireActivity().getActionBar()?.title = "Publicación"
        return inflater.inflate(R.layout.fragment_publicacion, container, false)
    }

    override fun onStart(){
        super.onStart()
        //requireActivity().setTitle("Publicación")
        //requireActivity().getActionBar()?.title = "Publicación"

        requireActivity().title = "Publicación"
    }

    override fun onResume(){
        super.onResume()
        //requireActivity().setTitle("Publicación")

        requireActivity().getActionBar()?.title = "Publicación"
    }

}
package com.androidavanzadotutorial.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object{
        //CONSTANTE
        const val MONEDA = "EUR"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //VALOR QUE NO VA A CAMBIAR
        val fecha = "26/12/1995"

        //VARIABLE QUE PUEDE CAMBIAR
        var nombre = "Juan Jose"

        println(nombre)



    }
}
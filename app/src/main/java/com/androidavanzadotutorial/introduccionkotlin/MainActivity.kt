package com.androidavanzadotutorial.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object{
        //CONSTANTE
        const val MONEDA = "EUR"
    }

    var saldo:Float = 300.54f
    var sueldo:Float = 764.82f
    var entero:Int = 26
    var double:Double = 45.78
    var character:Char = 'j'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //VALOR QUE NO VA A CAMBIAR
        val fecha = "26/12/1995"

        //VARIABLE QUE PUEDE CAMBIAR
        var nombre:String = "Juan Jose"
        var vip:Boolean = false
        var saludo:String = "Hola " + saldo.toString()

        println(saludo)



    }
}
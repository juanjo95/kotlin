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

        //Esto es un comentario
        /*
        * Esto es otro tipo de comentario
        * */

        /*
        *  Operadores de calculo
        */
        val a:Int = 5 + 5 //10
        val b:Int = 10 - 2 //8
        val c:Int = 3 * 4 //12
        val d:Int = 10 / 5 //2
        val e:Int = 10 % 3 //1
        val f:Int = 10 / 6 //1

        var aPreIncremento = 5
        var bPreDecremento = 5
        var cPostIncremento = 5
        var dPostDecremento = 5

        println(aPreIncremento)
        println(++aPreIncremento) //Incrementa primero, luego da salida 6
        println(aPreIncremento)

        println(bPreDecremento)
        println(--bPreDecremento) //Primero decrementar, luego da salida 4
        println(bPreDecremento)

        println(cPostIncremento)
        println(cPostIncremento++) //Primero muestra, luego incrementa salida 5
        println(cPostIncremento)

        println(dPostDecremento)
        println(dPostDecremento--) //Primero muestra, luego decrementa salida 5
        println(dPostDecremento)

        saldo += sueldo

        saldo++

    }
}
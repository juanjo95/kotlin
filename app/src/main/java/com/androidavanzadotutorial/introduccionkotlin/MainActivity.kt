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
        val fecha = "01/05/1990"

        //VARIABLE QUE PUEDE CAMBIAR
        var nombre:String = "Juan Jose"
        var vip:Boolean = false
        var saludo:String = "Hola " + nombre

        mostrar_saldo()
        ingresar_sueldo(50.5f)
        retirar_sueldo(40f)
        retirar_sueldo(50f)
        retirar_sueldo(2000f)

        /**
         * Arrays
         */
        var recibos:Array<String> = arrayOf("Luz","Agua","Gas")

        /**
         * Matrices
         */
        var matriz = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9,10,11,12,13)
        )

        /**
         * Condicional If -else
         */
        if(vip == true){
            saludo += ", te queremos mucho"
        }else{
            saludo += ", quieres ser VIP? paga la cuota"
        }

        /**
         * Condicional When (switch)
         */
        var dia = fecha.subSequence(0,2).toString().toInt()
        if(dia == 1) ingresar_sueldo()

        var mes = fecha.subSequence(3,5).toString().toInt()
        when(mes){
            1 -> print("\n En enero hay la super oferta del 7%")
            2, 3 -> print("\n En invierno no hay ofertas de inversiones")
            4, 5, 6 -> print("\n En primavera hay ofertas de inversiones con el 1.5% de interes")
            7, 8, 9 -> print("\n En verano hay ofertas de inversiones con el 2.5% de interes")
            10, 11, 12 -> print("\n En otoño hay ofertas de inversiones con el 3.5% de interes")
            else -> print("\n La fecha es erronea")
        }

        /**
         * Operadores logicos && = AND, || = OR, ! = NEGACION
         */
        var aa:Boolean = true
        var bb:Boolean = true
        var cc:Boolean = false
        var dd:Boolean = false

        aa && bb // Las 2 se deben cumplir
        aa || bb // Alguna de las 2 se debe cumplir
        aa && cc
        aa && dd
        !dd // Invierte el valor que tiene si es true lo pone falso y viceversa

        /**
         * BUCLE DO-WHILE (SE EJECUTA AL MENOS 1 VEZ)
         */
        var pin:Int = 1234
        var intentos:Int = 0
        var clave_ingresada:Int = 1233
        do {
            println("Ingrese el PIN:")
            println("Clave ingresada: ${++clave_ingresada}")
            if(clave_ingresada == pin) break
            intentos++
        }while (intentos < 3 && clave_ingresada != pin)
        if(intentos == 3) println("Tarjeta bloqueada")

        /**
         * Funciones
         */
        mostrar_saldo()

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

        /*
        *   Operadores de comparacion
        */

        a == b
        a != b
        a > b
        a < b
        a >= b
        a <= b



    }

    /**
     * Funciones sencillas
     */
    fun mostrar_saldo(){
        println("Tienes $saldo $MONEDA")
    }

    fun ingresar_sueldo(){
        saldo+= sueldo
        println("Se ha ingresado tu sueldo de $sueldo $MONEDA")
        mostrar_saldo()
    }

    /**
     * Funciones con parametros
     */
    fun ingresar_sueldo(cantidad:Float){
        saldo+= cantidad
        println("Se ha ingresado $cantidad $MONEDA")
        mostrar_saldo()
    }

    fun retirar_sueldo(cantidad:Float){
        if(verificarCantidad(cantidad)){
            saldo-= cantidad
            println("Se ha retirado $cantidad $MONEDA")
            mostrar_saldo()
        }else{
            println("Cantidad superior al saldo disponible")
        }
    }

    fun verificarCantidad(cantidad: Float):Boolean{
        if(cantidad > saldo){
            return false
        }else{
            return true
        }
    }

}
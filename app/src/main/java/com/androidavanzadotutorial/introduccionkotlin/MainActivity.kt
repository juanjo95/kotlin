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
        var nombre: String = "Juan Jose"
        var vip: Boolean = false
        var saludo: String = "Hola " + nombre

        mostrar_saldo()
        ingresar_sueldo(50.5f)
        retirar_sueldo(40f)
        retirar_sueldo(50f)
        retirar_sueldo(2000f)

        /**
         * Arrays
         */
        var recibos: Array<String> = arrayOf("Luz", "Agua", "Gas")
        recibos.set(2, "Internet")

        /**
         * Ciclo For (Recorrer un array)
         */
        recorrer_array(recibos)

        /**
         * Matrices
         */
        var matriz: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6, 7, 8, 9, 10),
            intArrayOf(11, 12, 13)
        )
        recorrer_matriz(matriz)

        /**
         * Colecciones Set - Inmutable
         */
        var clientesVip: Set<Int> = setOf(1234, 5678, 4040)
        val setMezclado = setOf(2, 4.454, "casa", 'c')

        println("Clientes VIP: \n")
        println(clientesVip)
        println("Numero de clientes VIP: ${clientesVip.size}")

        if (clientesVip.contains(1234)) println("1234 es VIP")

        /**
         * Colecciones Set - Mutable
         */
        var clientes: MutableSet<Int> = mutableSetOf(1234, 5678, 4040, 8970)
        println("Clientes: \n")
        println(clientes)
        clientes.add(3026)
        println(clientes)
        clientes.remove(5678)
        println(clientes)
        clientes.clear()
        println(clientes)
        println("Numero de clientes: ${clientes.size}")

        /**
         * Colecciones List y MutableList
         */
        var divisas: List<String> = listOf("USD", "EUR", "YEN")
        println(divisas)

        var bolsa: MutableList<String> = mutableListOf("Coca-cola", "Adidas", "Amazon", "Pfizer")
        println(bolsa)

        bolsa.add("Adobe")
        println(bolsa)

        bolsa.add("Nvidia")
        println(bolsa)

        bolsa.removeAt(2)
        println(bolsa)

        println(bolsa.first())
        println(bolsa.last())
        println(bolsa.elementAt(2))
        println(bolsa.none())

        println(bolsa.firstOrNull())
        bolsa.clear()
        println(bolsa)

        println(bolsa.none())
        println(bolsa.firstOrNull())

        /**
         * Colecciones Map
         */
        var mapa: Map<Int, String> = mapOf(
            1 to "espana",
            2 to "mexico",
            3 to "colombia"
        )
        println(mapa)

        /**
         * Coleccion Mutable Map
         */
        var inversiones = mutableMapOf<String, Float>()
        println(inversiones)

        /**
         * Bucle while
         */
        //Null Safety = (var empresa:String?) ó (bolsa.elementAtOrNull(index)!!)
        var empresa: String? = null;
        mostrar_saldo()
        var cantidad_a_invertir: Float = 90f
        var index: Int = 0

        while (saldo >= cantidad_a_invertir) {
            empresa = bolsa.elementAtOrNull(index)
            if (empresa != null) {
                saldo -= cantidad_a_invertir
                println("Se ha invertido $cantidad_a_invertir $MONEDA en $empresa")
                inversiones.put(empresa, cantidad_a_invertir)
            } else {
                break
            }
            index++
        }

        mostrar_saldo()

        /**
         * Condicional If -else
         */
        if (vip == true) {
            saludo += ", te queremos mucho"
        } else {
            saludo += ", quieres ser VIP? paga la cuota"
        }

        /**
         * Condicional When (switch)
         */
        var dia = fecha.subSequence(0, 2).toString().toInt()
        if (dia == 1) ingresar_sueldo()

        var mes = fecha.subSequence(3, 5).toString().toInt()
        when (mes) {
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
        var aa: Boolean = true
        var bb: Boolean = true
        var cc: Boolean = false
        var dd: Boolean = false

        aa && bb // Las 2 se deben cumplir
        aa || bb // Alguna de las 2 se debe cumplir
        aa && cc
        aa && dd
        !dd // Invierte el valor que tiene si es true lo pone falso y viceversa

        /**
         * BUCLE DO-WHILE (SE EJECUTA AL MENOS 1 VEZ)
         */
        var pin: Int = 1234
        var intentos: Int = 0
        var clave_ingresada: Int = 1233
        do {
            println("Ingrese el PIN:")
            println("Clave ingresada: ${++clave_ingresada}")
            if (clave_ingresada == pin) break
            intentos++
        } while (intentos < 3 && clave_ingresada != pin)
        if (intentos == 3) println("Tarjeta bloqueada")

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
        val a: Int = 5 + 5 //10
        val b: Int = 10 - 2 //8
        val c: Int = 3 * 4 //12
        val d: Int = 10 / 5 //2
        val e: Int = 10 % 3 //1
        val f: Int = 10 / 6 //1

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

        /**
         * Ejercicio 1
         */
        var numero: Int = 9
        do {
            println("Numero: $numero")
            numero--
        } while (numero >= 0)

        /**
         * Ejercicio 2
         */
        var num: Int = 1
        while (num <= 10) {
            if (num % 2 == 0) {
                println("Numero par: $num")
            }
            num++
        }

        /**
         * Ejercicio 3
         */
        var platos: Array<String> = arrayOf("pizza", "hamburguesa", "perro", "gaseosa")
        for (i in 0..(platos.size - 1)) {
            println("Plato: ${platos.get(i)}")
        }

        /**
         * Ejercicio 4
         */
        var men: Map<String, Int> = mapOf(
            "pizza" to 15,
            "hamburguesa" to 25,
            "perro" to 17,
            "gaseosa" to 8
        )

        var i: Int = 1
        for ((plato, precio) in men) {
            println("Plato ${i++}: $plato tiene un precio de $precio")
        }

        /**
         * Ejercicio 5
         */
        var menu = arrayOf(
            arrayOf("Pizza", 15f, arrayOf("carne", "queso", "harina", "maicitos")),
            arrayOf("Hamburguesa", 25f, arrayOf("Pan", "queso", "carne", "salsas", "tocineta")),
            arrayOf("Perro", 17f, arrayOf("Pan", "Salchicha", "queso")),
            arrayOf("Gaseosa", 8f, arrayOf("Agua", "Azucar", "Colorante"))
        )

        println("menu con precios e ingredientes")
        for (i in (0 until menu.size)) {
            for (j in (0 until menu[i].size)) {
                println()
                when (j) {
                    0 -> {
                        print("${i + 1}. ${menu[i][j]}")
                    }
                    1 -> {
                        print(" $${menu[i][j]}")
                    }
                    2 -> {
                        print(" Incredientes : ")
                        var ingredientes: Array<String> = menu[i][j] as Array<String>
                        for (i in ingredientes) {
                            print("$i - ")
                        }
                    }
                }
            }
        }
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

    /**
     * Ciclo for distintas formas
     */
    fun recorrer_array(array:Array<String>){

        //1ra forma del for, recorremos cada elemento.
        for (i in array) println(i)

        //2da forma, devuelve los indices de todos los elementos (posicion).
        for (i in array.indices) println(array.get(i))

        //3ra forma, recorrer desde el 0 hasta la longitud -1, tradicional.
        for (i in 0 .. array.size -1) println("${i+1} : ${array.get(i)}")

        //4ta forma, deciendole hasta donde y sin llegar a el.
        for (i in (0 until array.size)) println(array.get(i))
    }

    /**
     * Ciclo for anidado (matrices)
     */
    fun recorrer_matriz(array: Array<IntArray>){
        for (i in (0 until array.size)){
            println()
            for (j in (0 until array[i].size)){
                println("Posicion[${i}][${j}] : ${array[i][j]}")
            }
        }
    }

}
package co.edu.uniquindio.compiladores.prueba

import co.edu.uniquindio.compiladores.lexico.AnalizadorLexico

fun main(){
    val pruebaa = "4+9++6+987-56--87+-"
    val pruebab = "5¬=4>3>=6<>=7¬8|9==6=0=:==+=+"
    val pruebac = "@565\n757\n\n@@uouo@asd"
    val pruebad = "'p'55'\\'9\"perro\"\"ddd\"\"adasd"
    val pruebae = "({{[[]]]){,98.56.5"
    val lexico = AnalizadorLexico(pruebae)
    lexico.analizar()
    println(lexico.listaTokens)
}
package org.example

fun main() {
    println("Введите целое число n:")
    val nInput = readlnOrNull()?.trim()
    val n = nInput?.toIntOrNull()
    if (n == null) {
        println("Ошибка: n должно быть целым числом!")
        return
    }

    println("Введите основание степени x:")
    val xInput = readlnOrNull()?.trim()
    val x = xInput?.toIntOrNull()
    if (x == null || x <= 1) {
        println("Ошибка: x должно быть целым числом больше 1!")
        return
    }

    var y = 0
    var power = 1
    while (power < n) {
        power *= x
        y++
    }

    if (power == n) {
        println("Целочисленный показатель существует: y = $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}
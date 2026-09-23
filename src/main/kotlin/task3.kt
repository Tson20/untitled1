package org.example

fun main() {
    println("Введите натуральное число:")
    val input = readlnOrNull()?.trim()

    val number = input?.toIntOrNull()
    if (number == null || number <= 0) {
        println("Ошибка: нужно ввести натуральное число (больше 0)!")
        return
    }

    val binary = Integer.toBinaryString(number)
    println("Двоичное представление: $binary")
}
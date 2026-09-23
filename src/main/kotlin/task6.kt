package org.example

fun main() {
    println("Введите первую цифру:")
    val d1Input = readlnOrNull()?.trim()
    val d1 = d1Input?.toIntOrNull()
    if (d1 == null || d1 !in 0..9) {
        println("Ошибка: нужно ввести цифру от 0 до 9!")
        return
    }

    println("Введите вторую цифру:")
    val d2Input = readlnOrNull()?.trim()
    val d2 = d2Input?.toIntOrNull()
    if (d2 == null || d2 !in 0..9) {
        println("Ошибка: нужно ввести цифру от 0 до 9!")
        return
    }

    if (d1 == d2) {
        println("Ошибка: цифры должны быть разными!")
        return
    }

    val variants = listOf(d1 * 10 + d2, d2 * 10 + d1)
    val oddVariant = variants.firstOrNull { it % 2 != 0 }

    if (oddVariant != null) {
        println("Нечетное число: $oddVariant")
    } else {
        println("Создать нечетное число невозможно")
    }
}
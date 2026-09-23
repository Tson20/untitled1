package org.example

fun main() {
    println("Введите выражение в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
    println("Пример: 5 3 +")
    val input = readlnOrNull()?.trim()

    if (input.isNullOrEmpty()) {
        println("Ошибка: пустой ввод!")
        return
    }

    val parts = input.split(" ")
    if (parts.size != 3) {
        println("Ошибка: должно быть ровно 3 части (число, число, операция)!")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val operator = parts[2]

    if (num1 == null || num2 == null) {
        println("Ошибка: первые два элемента должны быть числами!")
        return
    }

    if (operator.length != 1 || operator !in listOf("+", "-", "*", "/")) {
        println("Ошибка: операция должна быть одной из: +, -, *, /")
        return
    }

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Ошибка: деление на ноль!")
                return
            }
            num1 / num2
        }
        else -> 0.0
    }

    println("Результат: $result")
}
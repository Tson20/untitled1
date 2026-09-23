package org.example

fun main() {
    println("Введите строку:")
    val input = readlnOrNull()?.trim()

    if (input.isNullOrEmpty()) {
        println("Ошибка: строка не может быть пустой!")
        return
    }

    val counts = mutableMapOf<Char, Int>()
    for (char in input) {
        counts[char] = counts.getOrDefault(char, 0) + 1
    }

    for ((char, count) in counts.toSortedMap()) {
        println("$char - $count")
    }
}
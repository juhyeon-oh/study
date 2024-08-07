package org.example

class Homework {
    fun calculate(num: Int): List<Int> {
        val results = mutableListOf<Int>()
        for (i in 1..9) {
            results.add(num * i)
        }
        return results
    }
}

/**
 * Created by Stanislav Gurin on 13.06.2017.
 */

import Color.*

fun main(args: Array<String>) {
    println(getColor(WHITE))
    getColorWithSet(setOf(RED, GREEN))
    likeManyIf(2, 4)
}

fun getColor(color: Color) = when (color) {
    BLACK, WHITE -> "Black or White"
    RED -> "Red"
    GREEN -> "Green"
    else -> "No color"
}

fun getColorWithSet(colorSet: Set<Color>) = when (colorSet) {
    setOf(BLACK, WHITE) -> println("Black or White")
    setOf(RED, GREEN) -> println("Red or Green")
    else -> println("No color")
}

fun likeManyIf(a: Int, b: Int) = when {
    (a > b) -> println("$a > $b = true")
    (a < b) -> println("$a < $b = true")
    (a == b) -> println("$a == $b = true")
    else -> println("Something other")
}
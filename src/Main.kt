/**
 * Created by Stanislav Gurin on 13.06.2017.
 */

fun main(args: Array<String>) {

    val color: Color = Color.GREEN
    val colorName: String = Color.RED.name
    val colorHex: String = Color.RED.colorHex
    val colorOpacity: Double? = Color.RED.opacity

    println(color)
    println(colorName)
    println(colorHex)
    println(colorOpacity)

    Color.BLACK.some()

}
/**
 * Created by Stanislav Gurin on 13.06.2017.
 */

fun main(args: Array<String>) {
    val userJava = UserJava("work.gurin@gmail.com")
    println("Java Example: ${userJava.email}")

    val userKotlin = UserKotlin("work.gurin@gmail.com")
    println("Kotlin Example: ${userKotlin.email}")
}
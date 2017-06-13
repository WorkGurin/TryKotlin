import openExample.Driver
import openExample.Person

/**
 * Created by Stanislav Gurin on 13.06.2017.
 */

fun main(args: Array<String>) {

    val person = Person("Stanislav")
    val driver = Driver("Stanislav")

    println(person)
    println(driver)

    println(person.getAddress())
    println(driver.getAddress())
}
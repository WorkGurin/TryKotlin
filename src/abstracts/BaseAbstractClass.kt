package abstracts

/**
 * Created by Stanislav Gurin on 13.06.2017.
 */
open abstract class BaseAbstractClass {

    var count = 0

    fun funDef() {
        count++
        println("Count: $count")
    }

    abstract fun minus()
}
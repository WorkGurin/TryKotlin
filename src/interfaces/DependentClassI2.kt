package interfaces

/**
 * Created by Stanislav Gurin on 13.06.2017.
 */

class DependentClassI2 : BaseInterface {
    override fun fun1() {
        println("DependentClassI2")
    }

    override fun funDef() {
        super.funDef()
    }
}

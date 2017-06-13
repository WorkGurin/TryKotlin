package interfaces

/**
 * Created by Stanislav Gurin on 13.06.2017.
 */
class DependentClassI1 : BaseInterface {
    override fun fun1() {
        println("DependentClassI1")
    }

    override fun funDef() {
        super.funDef()
    }
}
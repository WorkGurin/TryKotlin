import abstracts.BaseAbstractClass
import abstracts.DependentClassA1
import interfaces.DependentClassI1
import interfaces.DependentClassI2
import interfaces.BaseInterface

/**
 * Created by Stanislav Gurin on 13.06.2017.
 */

fun main(args: Array<String>) {
    withInterfaces()
    withAbstractClasses()
}

fun withInterfaces() {
    var dci1: BaseInterface = DependentClassI1()
    var dci2: BaseInterface = DependentClassI2()

    dci1.fun1()
    dci2.fun1()
}

fun withAbstractClasses() {
    var dca1: BaseAbstractClass = DependentClassA1()

    dca1.funDef()
    dca1.minus()
    dca1.funDef()
}
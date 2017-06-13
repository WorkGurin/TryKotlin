/**
 * Created by Stanislav Gurin on 13.06.2017.
 */
class Person(private var firstName: String, private var lastName: String, private var age: Int) {
    var isStudent: Boolean = false
        get() {
            return field
        }
        set(value) {
            field = value
        }



}
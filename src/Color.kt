/**
 * Created by Stanislav Gurin on 13.06.2017.
 */
enum class Color(val colorHex: String, val opacity: Double? = 1.0) {

    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#FF0000", 0.5),
    GREEN("#00FF00");

    fun some() {
        print("something")
    }
}
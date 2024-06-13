import kotlin.reflect.KProperty

class TextFormatter {
    var text: String by Property()
}

class Property {
    private var value: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value.replace(Regex("[0-9]"), "").lowercase().trim()
        println(this.value)
    }
}

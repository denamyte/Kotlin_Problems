import kotlin.properties.Delegates

class Student {

    var name: String = ""
    var id: Int by Delegates.notNull()

}

// Do not change the code below
fun main() {
    val student = Student()
    val id = readln().toInt()
    try { 
        println(student.id)
    } catch (e: Exception) {
        println(e.message)
    }
    student.id = id
    println(student.id)
}
data class Dog(val name : String, val breedParam : String, var ageParam : Int) {
    init {
        println("AAAAAA")
        ageParam = if (ageParam > 0) ageParam else 1
    }

//    var age: Int = 0
//        set(value) {
//            field = if (value > 0) value else 1
//        }
//        get() = if (field > 0) field else 1
//
//    var breed = breedParam

    fun woof() {
        if (ageParam > 20 ) println("Guv") else println("What do you want from me, pal?")
    }

    init {
        println("BBBBBB")
    }
}

class Cat(val name: String, ageParam: Int) {
//    private var age : Int = 0
//
//    init {
//        println("init part")
//        age = ageParam
//            get() = if (field > 0) field else 1
//            set(value) {
//                field = if (value > 0) value else 2
//            }
//    }
    var activities = arrayOf("Walks", "Sleep")
}

fun main(args: Array<String>) {

    val dog : Dog = Dog("Woofy", "goofy", -45)
    println(dog.hashCode())
    println(dog)
    dog.ageParam = 45
    println(dog.hashCode())

    val cats = arrayOf(Cat("Catty", 59), Cat("Mimi", 15))
    cats[1].activities = arrayOf("Run", "Walks", "Sleep", "Play")
    println("${cats[0].name}: ${cats[0].activities[0]}")
    println("${cats[1].name}: ${cats[1].activities[0]}")
    for (item in cats[1].activities) print("$item ")
}
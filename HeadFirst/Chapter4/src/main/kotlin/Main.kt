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

fun main(args: Array<String>) {

    val dog : Dog = Dog("Woofy", "goofy", -45)
    println(dog.hashCode())
    println(dog)
    dog.ageParam = 45
    println(dog.hashCode())
}
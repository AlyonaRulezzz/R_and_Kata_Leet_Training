interface Roamable {
    fun roam()
}

abstract class Animal : Roamable {
    abstract val food : String
    abstract val image : String
    abstract val habitat : String
    var hunger = 5

    fun sleep() {
        println("Animal sleeps")
    }
    abstract fun makeNoise()
    abstract fun eat()
    override fun roam() {
        println("Animal makes roams")
    }
}

class Hippo : Animal() {
    override val food = "meat"
    override val habitat = "Savanna"
    override val image: String
        get() = "Hippo.img"

    override fun makeNoise() {
        println("Hippo makes noise")
    }

    override fun eat() {
        println("Hippo eats")
    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("Canine roams")
    }
}

class Wolf : Canine() {
    override val food = "wolf's eat"
    override val habitat = "Tambov"
    override val image: String
        get() = "Wolfy.img"

    override fun makeNoise() {
        println("Wolf makes noise")
    }

    override fun eat() {
        println("Wolf eats")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("Vehicle roams")
    }
}

fun main() {
    val hippo = Hippo()
    println(hippo.food)
    println(hippo.image)
    val wolf = Wolf()
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    vet.giveShot(hippo)
    vet.giveShot(wolf)
    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) println(item.habitat)
    }
}
open class Animal {
    open val food = ""
    open val image = ""
    open val habitat = ""
    var hunger = 5

    fun sleep() {
        println("Animal sleeps")
    }
    open fun makeNoise() {
        println("Animal makes noise")
    }
    open fun eat() {
        println("Animal eats")
    }
    open fun roam() {
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

open class Canine : Animal() {
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
}
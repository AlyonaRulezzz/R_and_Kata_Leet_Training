fun main(args: Array<String>) {
    fizzBuzz(15)
}
//
//fun fizzBuzz(n: Int): Array<String> {
//    var massive = Array(n) { i -> (i + 1).toString() }
//    for (index in 0 until n) {
//        if (((index + 1) % 3 == 0) && ((index + 1) % 5 == 0)) {
//            massive[index] = "FizzBuzz"
//        } else if ((index + 1) % 5 == 0) {
//            massive[index] = "Buzz"
//        } else if ((index + 1) % 3 == 0) {
//            massive[index] = "Fizz"
//        }
//        print(massive[index] + " ")
//    }
//    return massive
//}

fun fizzBuzz(n: Int) = (1..n).map {
    when{it % 15 == 0 -> "FizzBuzz"
        it % 5 == 0 -> "Buzz"
        it % 3 == 0 -> "Fizz"
        else -> "$it"
    }
}.toTypedArray()

//DESCRIPTION:
//Return an array containing the numbers from 1 to N, where N is the parametered value.
//
//Replace certain values however if any of the following conditions are met:
//
//If the value is a multiple of 3: use the value "Fizz" instead
//If the value is a multiple of 5: use the value "Buzz" instead
//If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead
//N will never be less than 1.
//
//Method calling example:
//
//fizzBuzz(3) -->  ["1", "2", "Fizz"]
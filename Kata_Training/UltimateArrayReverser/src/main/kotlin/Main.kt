fun main(args: Array<String>) {

    val list = listOf("!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI")

    val reverseList = reverse(list)

}

fun reverse(a: List<String>): List<String> {
    var reverseList = mutableListOf<String>()
    var allList = ""
    for (item in a) {
        allList += item
//        println(lists)
    }

    allList = allList.reversed()
    for (i in a.indices) {
        reverseList.add(allList.substring(0, a[i].length))
        allList = allList.drop(a[i].length)
    }
    for (item in reverseList) {
        print("$item ")
    }
    return reverseList
}

//fun reverse(a: List<String>): List<String> {
//    val str = a.joinToString("").reversed().iterator()
//    return a.map { Array(it.length) { str.nextChar() }.joinToString("") }
//}

//fun reverse(a: List<String>): List<String> {
//    var str = a.joinToString("").reversed()
//    return a.map{val s = str.take(it.length);str = str.drop(it.length);s}
//}

//Task
//Given an array of strings, reverse them and their order in such way that their length stays the same as the length of the original inputs.
//
//Example:
//Input:  {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}
//Output: {"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"}
//Good luck!
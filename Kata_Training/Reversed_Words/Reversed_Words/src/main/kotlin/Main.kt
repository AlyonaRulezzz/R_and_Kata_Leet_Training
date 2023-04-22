fun main(args: Array<String>) {

    print(reverseWords("I like eating"))

}

fun reverseWords(str:String) : String {
    var list : List<String> = str.split(" ").reversed()
    var strWithWordsInReversedOrder : String = ""
    for (l in list) {
        strWithWordsInReversedOrder =
            StringBuilder(strWithWordsInReversedOrder).append(l).append(" ").toString()
    }
    return strWithWordsInReversedOrder.trim()
}

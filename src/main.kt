fun main () {
    var number: Int
    var writeout = ""

    print("Enter a number between one and 10: ")

    number = readLine()!!.toInt()

    when (number) {
        1 -> writeout = "Un-way"
        2 -> writeout = "Oot-way"
        3 -> writeout = "Ee-thray"
        4 -> writeout = "Our-fay"
        5 -> writeout = "Ive-fay"
        6 -> writeout = "Ix-say"
        7 -> writeout = "Even-say"
        8 -> writeout = "Eight-ay"
        9 -> writeout = "Ine-nay"
        10 -> writeout = "En-tay"
        !in 1..10 -> writeout = "Otnay in Angeray Unway Ootay Entay"
        else -> writeout = "Atastrophetay!!!"
    }

    println("In Pig Latin, the number you entered is said $writeout")
}
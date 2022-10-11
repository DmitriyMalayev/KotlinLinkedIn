//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}

//fun main() {
//    var ourFirstVariable = true
//    println(ourFirstVariable)
//
//    ourFirstVariable = false
//    println(ourFirstVariable)
//
//    println(ourFirstVariable==true)
//    println(ourFirstVariable==false)
//
//}

//fun main() {
//    val aInt: Int = 0
//    val anotherInt = 0   //32 bits  Specifying data type is optional
//
//    val aByte:Byte =0 //8 bits
//    val aShort: Short =0  //16 bits
//    val aLong: Long =0 //64 bits
//
//    val inferredInt = 10  //automatically Int because it fits within 32 bits
//    val inferredLong = 100_000_000_000_000   //Long
//    val anotherLong = 10L   //Signifies Long
//
//    val unsignedInt: UInt = 0U  //Unsigned
//    val unsignedLong = 0UL  //Unsigned and Long
//
//    val aDouble: Double = 5.5  //64 Bit
//    val aFloat: Float = 5.5f //32 Bit
//
//    val inferredDoubleDefault = 5.5   //Double
//    val inferredFloat = 5.5f //Float
//
//    println(5 == 4)
//    println(10f > 1)
//    println(10.1 <= 5.2)
//    println()
//
//    println(10.5.toInt())
//    println(10.9)
//    println(10.9.toFloat())
//    println(5.toULong())
//    println(100_000_000.toByte())


//fun main() {
//    //Characters
//    val aChar: Char = 'a'
//    val aNumericChar = '1'
//    val newLineChar = '\n'
//
//    //val concatOption1 = 'a' + 'b'    Doesn't work
//    //val concatOption2 = 'ab'  Too many characters
//
//    val aString: String = "Hello Kotlin!"
//    val escaped = "Hello \n World"
//    println(escaped)
//
//    val raw = """
//      >>Some
//        multiline
//     text
//      >>is going on
//       here
//    """.trimMargin(">>")
//    println(raw)
//    println()
//
//    val raw2 = """
//     Some
//        multiline
//     text
//      is going on
//       here
//    """
//    println(raw2)
//    println()
//    //Strings are immutable
//    val concatString = "Hello" + " Kotlin!"
//    println(concatString)
//
//    val concatNumber = "The number " + 10
//    println(concatNumber)
//
//
//    val aNumber = 10
//    val concatTemplate = "The number ${1 + aNumber}"
//    println(concatTemplate)
//
//    println()
//    val someString = "  "
//    println(someString.isNotBlank())  //doesn't count whitespaces. false
//    println(someString.isNotEmpty())  //counts whitespaces. true.
//
//
//    val anotherString = "Hello Kotlin World!"
//    println(anotherString.contains("Kotlin"))
//
//}

/*
NullPointerException
fun main() {
    var aNullableString: String? = null
    println(aNullableString!!.length)
    asserting that a value is not null before accessing it.
}
fun main() {
    var aNullableString: String? = null
    println(aNullableString?.length)
    //Prevents throwing a null pointer exception and will return null instead.
}

fun main() {
    var aNullableString: String? = "Kotlin"
    println(aNullableString?.length ?: "The value was null")
  //  Prints "The value was null if it's null and the length of the string if it's not null"
}
*/

// FUNCTIONS
//
//fun getGreeting(): String {
//    return "Hello Kotlin"
//}
//
//fun getGreeting2() {
//    println("Hello Kotlin")  //returns value and Kotlin Unit
//}
//
//fun getGreeting3() = "Hello Kotlin"
//fun printGreeting() = println("Hello Kotlin") //returns value and Kotlin Unit
//fun printGreetingError() = println(printGreeting2()) //Compiler Error
//
//
//fun main() {
//    println(getGreeting())
//    println(getGreeting2())
//    println(getGreeting3())
//    println(printGreeting())
//    fun printGreeting2() = "Locally Scoped Function"
//    println(printGreeting2())
//}
//
//private fun printGreeting() = println("Hello Kotlin")
//
//fun main() {
//    fun getGreeting(greeting: String = "Hello", thingToGreet: String = "World") = "$greeting $thingToGreet"
//    println(getGreeting("Hello", "Kotlin"))
//    println(getGreeting("Hello"))
//    println(getGreeting("Hi"))
//    println(getGreeting())
//    println(getGreeting(thingToGreet = "World", greeting = "Hey There"))
//}































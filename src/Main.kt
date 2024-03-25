fun main() {
   occurrences("Barnie bakes brown bagels and buns")

    values(30,59,67)
    volume(3.14159,34,4/3)
    ispalindrome("racecar")
}
fun occurrences(text:String){
    println(text.slice(1..6))
    println(text.slice(8..12))
    println(text.slice(14..18))
    println(text.slice(20..29))
    println(text.slice(31..33))

}

fun values(num1:Int,num2:Int,num3:Int):Int{
    var values = arrayOf(num1,num2,num3)
    var sum =num1 +num2 +num3
    return sum
    var count = sum.countOneBits()
    return count
        var average = sum/3
    return average


}

fun volume(pie:Double,radius:Int,num:Int){
  var  volume = 4/3 *3.14159*34*34*34
    println(volume)

}
fun ispalindrome(word: String) :Boolean {
    val newInputString = word.reversed()
    if (word == word.reversed()) {
        return true
    } else {
        return false
    }
}








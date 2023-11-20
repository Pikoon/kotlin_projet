import com.example.kotlin_projet.exo.BAGUETTE
import com.example.kotlin_projet.exo.CROISSANT
import com.example.kotlin_projet.exo.SANDWICH

fun main(){
    println("Hello")
    var v1 = "toto"
    println(v1.uppercase())
    var v2:String? = "toto"
    println(v2?.uppercase())
    var v3:String? = null
    println(v3?.uppercase())
    //v3+v3 donnera une variable de type String
    println(v3 ?: "Toto")
    println(boulangerie(scanNum("Nombre de croissants : "), scanNum("Nombre de baguettes : "), scanNum("Nombre de sandwichs : ")))

}

fun min (a : Int, b : Int, c : Int) = if (a<c && a<b) a else if (b<c && b<a) b else c

fun pair (a:Int) = a%2==0

fun myPrint (text:String) = println("#$text#")

fun boulangerie(nbC:Int = 0, nbB:Int = 0, nbS:Int = 0) = CROISSANT * nbC + BAGUETTE * nbB + SANDWICH * nbS

fun scanText(question:String) :String {
    println(question)
    return readlnOrNull() ?: "-"
}

fun scanNum(question:String):Int {
    return scanText(question).toIntOrNull() ?: 0
}
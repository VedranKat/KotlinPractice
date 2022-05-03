

fun main(){
    val list = mutableListOf<Int>()

    list.add(10)
    list.add(5)
/*
    val input = try {
        readLine()?.toInt()
    }catch (e: NumberFormatException){
        0
    }

    for(x in list){
        when(x.isPrime()) {
            false -> {
                println("$x nije prim broj")
            }
            else -> {
                println("$x je prim broj")
            }
        }
    }

    var list = (1..20).toList()
    list = list.filter{i%2==0}
*/

    val myC = Rectangle(2.5, 2.5)

    print(myC.area())


}

fun Int.isPrime(): Boolean{
    for(i in 2..this-1){
        if(this%i == 0){
            return false
        }
    }
    return true
}

class Rectangle(val a: Double,val b: Double): Shape("Rectangle"){

    init{
        print("$name created, a= $a, b= $b")
    }

    override fun area(): Double = a*b
}

abstract class Shape(var name: String){
    init{
        println("Ja sam superklasa!! Oblik: $name")
    }

    abstract fun area(): Double
}
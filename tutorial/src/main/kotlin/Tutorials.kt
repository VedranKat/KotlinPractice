

fun main(){
    val list = mutableListOf<Int>()

    for(i in 1..10){
        val x = readLine()?.toInt()
        if(x!=null) {
            list.add(x)
        }
    }



}

fun ageI(){
    val age = readLine()?.toInt()
    val x = 5

    when(age){
        in 1..5 -> println("Izmedju 1 i 5")
        10 -> println("Tocno 10")
        3 -> if(x!=6){
            print("Unos je $age a x razlicit od 6")
        }
        else -> print("Ostalo")
    }
}
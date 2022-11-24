



fun main(){
    val name = "Shaima"
    var year = 2022
    var candles = 8
    println("Happy Eid, ${name}!!")
    println("Your Eidyah is: ${100+300} !!")
    
    
    // Let's print a cake!
    printCandles(candles)
    
    // This prints an empty line.
    println("")

    println("It's $year!")
    println("$year is very special year!")
	
}

fun printCandles(candles : Int){
        print(" ")
        repeat(candles){
             print(",")
        }     
    
    	println()

        print(" ")
        repeat(candles){
             print("|")
        }
    	println()
}

fun printcake(){
    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("@@@@@@@@@@@")
    println("@@@@@@@@@@@")
}

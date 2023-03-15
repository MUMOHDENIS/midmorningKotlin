fun main(args: Array<String>) {
    // IF STATEMENTS
    var age= 20
    if (age<18){
        println("You are under age")
    } else{
        println("Welcome to the party")

    }



    var marks= 70
    if (marks<=50){
        println("C-")
    }else if (marks<=60){
        println("B-")}
    else if (marks<=70){
        println("B+")
    }else{
        println("A")
    }


    // WHEN STATEMENTS
    var bettingNumber =0
    when (bettingNumber){
        1 -> {
            println("you lost")
        }
        2 -> {
            println("You lost")
        }
        3 -> {
            println("You Won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Please enter a number from 1 - 4 to bet")
        }
    }
}

object solution extends App {
    def isEven(n:Int):Boolean= n match{
        case 0 => true
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(isEven(n))


    def sum(n : Int):Int= {
        var res = 0
        if(n <= 1){
            return 0
        }
        else if(isEven(n)){
            res = n + sum(n-1)
            return res
        }
        else{
            res = res+sum(n-1)
            return res
        }
    }

    print("Enter number: ")
    val num = scala.io.StdIn.readInt()
    println("Sum is = "+ sum(num-1))
}
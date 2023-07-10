object solution extends App{
    def isEven(n:Int):Boolean= n match{
        case 0 => true
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(isEven(n))

    print("Enter number: ")
    var n = scala.io.StdIn.readInt()
    var res = isEven(n)
    res match{
        case true => println("Number is even")
        case false => println("Number is odd")
    }
}
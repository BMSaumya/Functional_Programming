object Q2_8{
    def patternMatching(n:Int)= {
        n match{
            case n if n<=0 => println("Negative/Zero")
            case n if n%2 == 0 => println("Even")
            case _=> println("Odd")
        }
    }

    def main(args: Array[String]):Unit={
        val n = scala.io.StdIn.readLine("Enter integer ").toInt
        patternMatching(n)
    
    }
}
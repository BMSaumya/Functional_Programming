object two{
    def main(args: Array[String])={
        println("Enter input value: ")
        var in = scala.io.StdIn.readInt()
        check(in)
    }

    def check(n: Int)=n match{
        case n if n <= 0 => println("Negative/Zero")
        case n if n%2 == 0 => println("Input is Even")
        case _ => println("Input is Odd")
    }
}
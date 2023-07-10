object solution extends App {
    def sum(n : Int):Int= {
        var res = 0
        if(n == 1){
            return 1
        }
        else{
            res = n + sum(n-1)
            return res
        }
    }

    print("Enter number: ")
    val num = scala.io.StdIn.readInt()
    println("Sum is = "+ sum(num))
}
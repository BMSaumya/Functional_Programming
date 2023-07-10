object solution extends App{
    def prime(p:Int,n:Int=2):Boolean= n match {
        case n if(n==p) => true
        case n if GCD(p,n)>1 => false
        case n => prime(p,n+1)
    }
    
    def GCD(a:Int,b:Int):Int=b match{
        case 0 => a
        case b if b>a => GCD(b,a)
        case _ => GCD(b,a%b)
    }

    println("Enter Integer: ")
    var n = scala.io.StdIn.readInt()
    println(prime(n))
}
    

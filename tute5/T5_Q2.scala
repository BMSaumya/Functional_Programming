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

    def primeSeq(n: Int):Unit={
        if(n>=1){
            var i = prime(n)
            if(i){
                println(n)
            }
            primeSeq(n-1)
        }
    }

    println("Enter number: ")
    var n = scala.io.StdIn.readInt()
    primeSeq(n)
}
object one{
    def main(args: Array[String])={
        println("Enter deposit amount: ")
        var deposit: Float = scala.io.StdIn.readFloat()
        println("Interest amount is: "+ interest(deposit))
    }

    def interest(deposit:Float):Float=deposit match{
        case deposit if deposit<=0f => return 0

        case deposit if deposit <= 20000f => return deposit*0.02f
    
        case deposit if deposit <= 200000f => return deposit*0.04f
        
        case deposit if deposit <= 2000000f => return deposit*0.035f

        case _ => return deposit*0.065f     
    }

}

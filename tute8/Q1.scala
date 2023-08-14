    def interest(deposit: Float): Float = {
        val rate: Float = deposit match{
        case d if d<=20000 =>  0.02f
        case d if d <= 200000 => 0.04f
        case d if d <= 2000000 => 0.035f
        case _ => 0.065f
        }
        rate*deposit
    }

    def main(args: Array[String]):Unit={
        
        val deposit = scala.io.StdIn.readLine("Enter deposit amount ").toFloat

        if(deposit >= 0)
            println("Interest is "+ interest(deposit))
    }
object Q2_9{

    class rational(unum1: Int, unum2: Int, dnum1: Int, dnum2: Int){
        def un1 = unum1
        def un2 = unum2
        def dn1 = dnum1
        def dn2 = dnum2

        def subtract() = un1*dn2 - un2*dn1
    }

    def main(args: Array[String]):Unit={
        val in1 = scala.io.StdIn.readLine("Enter first value: ")
        val numm1: Array[String] = in1.split("/")
        val num1 = numm1.map(_.toInt)

        val in2 = scala.io.StdIn.readLine("Enter second value: ")
        val numm2: Array[String] = in2.split("/")
        val num2 = numm2.map(_.toInt)

        if(num1(1) != 0 && num2(1) != 0){
            val rat1 = new rational(num1(0), num2(0), num1(1), num2(1))
            val subValUp = rat1.subtract()
            val subValDown = num1(1)*num2(1)
            println("subtracted value is: "+ subValUp +"/"+ subValDown)   
        }
    }
}
// object Q1_9{

//     class rational(number: Int){
//         def nu = number
//         def neg()= -number
//     }

//     def main(args: Array[String]):Unit={
//         val in = scala.io.StdIn.readLine("Enter value to turn into negative: ")
//         val num: Array[String] = in.split("/")

//         if(num(1).toInt != 0){
//             if(num(0).toInt == 0){
//                 println("0")
//             }
//             else{
//                 val rat1 = new rational(num(0).toInt)
//                 println("Negative value is "+ rat1.neg()+"/"+num(1).toInt)
//             }   
//         }
//     }
// }




object Q1_9{

    class rational(number: Int){
        def nu = number
        def neg()= -number
    }

    def main(args: Array[String]):Unit={
        val in = scala.io.StdIn.readLine("Enter value to turn into negative: ")
        val numm: Array[String] = in.split("/")
        val num = numm.map(_.toInt)

        if(num(1) != 0){
            if(num(0) == 0){
                println("0")
            }
            else{
                val rat1 = new rational(num(0))
                println("Negative value is "+ rat1.neg()+"/"+num(1))
            }   
        }
    }
}
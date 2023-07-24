import scala.io.StdIn.{readLine,readInt}
import Array._
object one extends App{
    
    val input = readLine("enter text: ")
    
    val a: List[Char] = input.toList
    val s = a.size;

    cipher()

    def encrypt(n: Int)={
        for(i <- a){
            if('A'<= i && i <= 'Z' || 'a'<= i && i <='z'){
                var j = (i+n).toChar

                j match
                    case j if('Z'< j && j < 'a') => print("Z")
                    case j if(j > 'z') => print("z")
                    case _ => print(j)
            }
            else{
                println("Not a text")
            }
        }
    }

    def decrypt(n: Int)={
        for(i <- a){
            if('A'<= i && i <= 'Z' || 'a'<= i && i <='z'){
                var j = (i-n).toChar

                j match
                    case j if(j < 'A') => print("A")
                    case j if('Z'< j && j <'a') => print("a")
                    case _ => print(j)
            }
            else{
                print("Not a valid text")
            }
        }
    }

    def cipher()={
        val shift = readLine("Enter number to shift: ").toInt
        val method = readLine("select 1.encrpt or 2.decript: ").toInt
        if(method == 1){
            encrypt(shift)
        }
        else if(method == 2){
            decrypt(shift)
        }
        else{
            println("invalid input")
        }
    }   
}
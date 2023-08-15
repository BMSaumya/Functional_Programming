object Q3_8{

    val toUpper : String => String = (str : String) => {str.toUpperCase()} 
    val toLower : String => String = (str : String) => {str.toLowerCase()}

    def formatNames(name: String, f:(String)=> String): String={
        f(name)
    }

    def toUpperSpecific(str : String): String = {
        print("Enter an index to format: ")
        val i = scala.io.StdIn.readInt()
        if(i < 0 || i >= str.length()) 
            return "not a valid index"
        else {
            str.updated(i, str(i).toUpper)
        }
    }


    def main(args: Array[String])={
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan", toUpperSpecific))
        println(formatNames("Saman", toLower))
        println(formatNames("Kumara", toUpperSpecific))
    }

}
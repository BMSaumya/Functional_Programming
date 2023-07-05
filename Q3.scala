object three{

    def toUpper(a: String):String={
        return a.toUpperCase()
    }

    def toLower(b: String): String={
        return b.toLowerCase()
    }

    def formatNames(name: String, f:(String)=> String): String={
        return f(name)
    }

    def toUpperSpecific(str : String): String = {
        print("Enter an index to format: ")
        val i = scala.io.StdIn.readInt()
        if(i < 0 || i >= str.length()) 
            return "not a valid index"
        else {
            return str.updated(i, if(str(i).isLower) str(i).toUpper else str(i))
        }
    }


    def main(args: Array[String])={
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan", toUpperSpecific))
        println(formatNames("Saman", toLower))
        println(formatNames("Kumara", toUpperSpecific))
    }

}
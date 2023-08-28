import scala.collection.immutable._

object Q2_10{

    def countLetterOccurrences(li: List[String])={
        val newList: List[Int] = li.map(words)
        println("String sizes are: "+ newList)

        val result = newList.reduce((x,y)=> x+y)
        println("Total count of letter occurrences: "+ result)
    }

    def words(n: String)={
        n.length()
    }

    def main(args: Array[String])={
        val input: List[String] = List("apple", "banana", "cherry", "date")
        countLetterOccurrences(input)
    }
}
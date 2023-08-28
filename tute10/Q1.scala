import scala.collection.immutable._

object Q1_10{

    def calculateAverage(li: List[Double])={
        val collection = li.map(convert)

        val result = collection.reduce((x, y) => x+y)

        println("Average is "+ result/li.length)
    }

    val convert = (c: Double) => (c*9/5)+32

    def main(args: Array[String])={
        val input: List[Double] = List(0, 10, 20, 30, 40) 

        calculateAverage(input)
    }
}
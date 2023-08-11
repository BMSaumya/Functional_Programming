object Q2{
    def main (args: Array[String]): Unit = {
        println("Enter a list of numbers separated by spaces:")
        val list = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

        println(calculateSquare(list));
    }

    val calculateSquare = (numbers: List[Int]) =>{
        numbers.map(num => num * num);
    }
}
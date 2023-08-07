object Q1{
    def filterEvenNumbers(list: List[Int]): List[Int] = {
        list.filter((x: Int) => x % 2 == 0)
    }

    def main(args: Array[String]): Unit = {
        // val list = List(1, 2, 3, 4, 5, 6, 7, 8)
        println("Enter a space seperated number list:")
        val list = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

        println(filterEvenNumbers(list))
    }
}
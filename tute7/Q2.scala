object Q2{
    def main (args: Array[String]): Unit = {
        var squreNumbers: List[Int] = calculateSquare(List(1, 2, 3, 4, 5));
        println(squreNumbers);
    }

    val calculateSquare = (numbers: List[Int]) =>{
        numbers.map(num => num * num);
    }
}
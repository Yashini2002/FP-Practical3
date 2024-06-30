object Third {
  def main(args: Array[String]): Unit = 
  {
    println("Enter num1: ")
    val num1 = scala.io.StdIn.readInt()
    println("Enter num2: ")
    val num2 = scala.io.StdIn.readInt()
    
    val avg = average(num1, num2)
    println(f"Average of num1 and num2: $avg%.2f")
  }
  
  def average(num1: Int, num2: Int): Double = {
    val total = num1 + num2
    val avg = total / 2.0
    BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }
}

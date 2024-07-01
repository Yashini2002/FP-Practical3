object Second {
  def main(args: Array[String]): Unit = 
  {
    println("Enter 5 strings:")
    val stringList = (1 to 5).map(_ => scala.io.StdIn.readLine()).toList
    val result = stringLen(stringList)
    println(s"Strings longer than 5 characters: $result")
  }

  def stringLen(strings: List[String]): List[String] = 
  {
    strings match {
      case Nil => Nil
      case head :: tail =>
        if (head.length > 5) head :: stringLen(tail)
        else stringLen(tail)
    }
  }
}

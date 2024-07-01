object Fourth{
   def main(args:Array[String]):Unit=
   {
     println("Enter the number of elements in list:")
     val n= scala.io.StdIn.readInt()
     println("Enter the elements:");
     val integerList=(1 to n).map(_ => scala.io.StdIn.readInt()).toList
     val result=IntSum(integerList)
     println(s"Sum of even numbers: $result")
   }

   def IntSum(numbers:List[Int]):Int=
   {
      numbers match {
      case Nil => 0
      case head :: tail =>
        if (head % 2 == 0) head + IntSum(tail)
        else IntSum(tail)
    }
   }
}

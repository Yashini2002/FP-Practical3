object First{
     def main(args:Array[String]):Unit=
     {
         println("Enter a string: ")
         val str=scala.io.StdIn.readLine()
         println(s"Reversed string: ${reverseStr(str)}")
     }

     def reverseStr(s:String):String=
     {
         if(s.length<=1) s
         else reverseStr(s.tail)+s.head
     }
}
package labsheet5

import scala.io.StdIn

object lab5_q4 {

  def main(args: Array[String]): Unit = {

    println("Enter any number : ")
    val num = StdIn.readInt()
    println("Entered number : " +isEven(num))
  }

  def isEven(i: Int): String = i  match{
    case i if (i==0) => "Even number"
    case i if (i==1) => "Odd number"
    case i if (i<0) => isEven(i+2)
    case _ => isEven(i-2)

  }


}

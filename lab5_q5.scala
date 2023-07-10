package labsheet5

import scala.io.StdIn

object lab5_q5 {

  def main(args : Array[String]): Unit = {
    println("Enter any number : ")
    val num = StdIn.readInt()
    println("The sum of the even numbers up to " +num +":" +evenSum(num-1))
  }


  def isEven(i: Int): Boolean  = i match {
    case i if (i == 0) => true
    case i if (i == 1) => false
    case _ => isEven(i - 2)
  }

  def evenSum(i: Int):Int = i match{
    case i if (i==0) => 0
    case i if isEven(i) => i + evenSum(i-2)
    case _ => evenSum(i-1)
  }


}

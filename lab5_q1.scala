package labsheet5

import scala.io.StdIn

object lab5_q1 {

  def main(args: Array[String]): Unit = {

    println("Enter the number : ");
    val num = StdIn.readInt() //take number as user input
    println(prime(num));

  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case 1 => false
    case n if (p == n) => true
    case n if (p % n == 0) => false
    case _ => prime(p, n + 1)

  }

}



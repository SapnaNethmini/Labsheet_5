package labsheet5

import scala.io.StdIn

object lab5_q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the number :");
    val num = StdIn.readInt()
    println("Prime numbers up to "+num +" :")
    primeSeq(num-1)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case 1 => false
    case n if (p == n) => true
    case n if (p % n == 0) => false
    case _ => prime(p, n + 1)
  }

  def primeSeq(p: Int) : Unit = {
    if (p == 2){
      print(p)
    }
    else{
      primeSeq(p-1)
      if (prime(p))
        print("," + p)
    }
  }

}





package labsheet5

import scala.io.StdIn

object lab5_q3 {
  def main(args: Array[String]): Unit = {

    println("Enter value: ")
    val num = StdIn.readInt()
    println("The sum is : " +sum(num))
  }

  def sum(n: Int , m:Int = 1): Int = {
    if(n>= m)
      n+sum(n-1,m)
    else
      return 0;
  }


}

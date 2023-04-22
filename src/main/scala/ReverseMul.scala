import scala.io.StdIn.readInt

object ReverseMul {
  def main(args: Array[String]): Unit = {
    println("enter number:")
    var num = readInt()
    for (i <- 10 to 1 by -1 if (i != 7)) {
      println(num * i);
    }
  }
}







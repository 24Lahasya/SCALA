import scala.io.StdIn.readInt

object OddNumber {
  def main(args: Array[String]): Unit = {


    println("enter range :")
    var n = readInt()
    for (i <- 1 to n if i % 2 != 0 if (i % 7 != 0)) {
      println(i)
    }

  }
}




import scala.io.StdIn.readInt

object EvenNumber {
  def main(args: Array[String]): Unit = {
    println("enter range :")
    var n =readInt()

    for (i <- 1 to n if i % 2 == 0  if (i%6!=0)) {
      println(i)
    }

    }
  }


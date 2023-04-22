import scala.io.StdIn.readLong

object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    println("enter number:")
    var n = readLong()
    for (i<-0 to 20 if i!=5){
      println(n + " * " + i + " = " + (n*i))
    }

  }
}
object ForLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i)
    }
    for (i <- 1 until 10) {
      println(i)
    }
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }
    println("==========================")
    for (i <- 1 to 100 by 2) {
      println(i)
    }
    for (i <- 1 to 100 by -2) {
      println(i)
    }
  }
}
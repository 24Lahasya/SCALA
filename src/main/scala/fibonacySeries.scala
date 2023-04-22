object fibonacySeries {
  def main(args: Array[String]): Unit = {
    val n = 20

    for (i <- 0 to n - 1) {
      print(fibonacy(i) + " ")
    }
  }

  def fibonacy(n: Int): Int = {
    if (n == 0 || n == 1) {
      n
    } else {
      fibonacy(n - 1) + fibonacy(n - 2)
    }
  }

}

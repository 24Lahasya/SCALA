object ArrayTest {
  def main(args: Array[String]): Unit = {
    val a = Array.ofDim[Int](n1 = 2, n2 = 2)
    var n: Int = 2
    val a2 = Array(Array(1, 2, 3, 4), Array(3, 4, 5, 7))
    a(0)(0) = 10
    a(0)(1) = 20
    println(a(0)(0))
    for (i <- 0 until n; j <- 0 until n) {
      print(i, j)
      println(" = " + a(i)(j))
    }
    println("first array")
    for (i <- 0 until 2) {
      for (j <- 0 until 2) print(s" ${a(i)(j)}")
      println()
    }
    println("second array")
    for (i <- 0 until 2) {
      for (j <- 0 until 4) print(s" ${a2(i)(j)}")
      println()
    }
    println("third array")
    val a3 = Array(Array(1, 2, 3, 4), Array(5, 7, 8, 9), Array(10, 11, 12, 13), Array(14, 15, 16, 17))
    for (i <- 0 until 4) {
      for (j <- 0 until 4) print(s" ${a3(i)(j)}")
      println()
    }
  }

}


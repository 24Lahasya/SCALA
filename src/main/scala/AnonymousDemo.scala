object AnonymousDemo {
  def main(args: Array[String]): Unit = {
    val af =(i:Int) => {
      println(" anonymous function")
      i
    }
    println(af(10))

    val test = () => {
      println("hello")
    }
    test()
    val test1 = (x:String, y:String) => {
      println(s"$x $y")
    }
    test1("Lahasya","Vamshi")
  }
}
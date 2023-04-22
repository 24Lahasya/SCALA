object FunctionDemo {
  def main(args: Array[String]): Unit = {
    val a="hello"
    val b="scala"
    if (a==b){
      println("a is equal ot b")
    }else {
      println("a is not equal to b")
    }
    val k="lahasya"
    val l ="vamshi"
    if (k eq l){
      println("k is equal to l")
    }else {
      println("k is not equal to l")
    }
    val  r=23
    val s=23

    if (r.equals(s)){
      println(" r is equal to s")
    }else{
      println("r is not equal to s")
    }
  }
}

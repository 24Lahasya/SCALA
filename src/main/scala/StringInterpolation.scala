object StringInterpolation{
  def main(args: Array[String]): Unit = {
    var x=10

    var l=2.2
    var k=s"scala $x"
    println("scala")
    println(f"this is string $l%2.20f")
    println(raw"value of x\n $x")
    println(s"value $$ of x is $x")
  }
}

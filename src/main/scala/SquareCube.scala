object SquareCube {
  def myCalculator(a: Int, b: Int, func: (Int) => Int): Int = func(a)+func(b)

  def main(args: Array[String]) = {
    var c = myCalculator(10, 20, square)
    var c1=myCalculator(10,20,cube)
    var c3=myCalculator(10,30,(x:Int)=>x*x*x*x);
    println(c)
    println(c1)
    println(s"===>$c3")
  }
  def square(a:Int):Int=(a*a);
  def cube(a:Int):Int=(a*a*a);
}

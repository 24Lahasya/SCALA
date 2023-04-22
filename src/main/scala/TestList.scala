object TestList {
  def main(args: Array[String]): Unit = {
    val l1=List(1,2,3,4,5)
    val l2:List[String]=List("abc","xyz")
    val l3=Nil
    var l4=List.empty
    println(l1)
    println(l2:::(3::Nil))
    val v3=List.fill(7)(6);
    println(v3)
    println(v3.size)
    println(v3.length)
    println(l1.length)
    println(l1.apply(2))
    println(l1(1))
    for(i<-l1){
      println(i)

    }
    println(l1.head)
    println(l1.tail)
println(l1.contains(1))
  }
}

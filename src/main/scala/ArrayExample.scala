object ArrayExample {
  def main(args: Array[String]): Unit = {
    var myvar:Array[String] =new Array[String](3)
    myvar(0)="Hello"
    myvar(1)="Lahasya"
    myvar(2)="Vamshi"
    println(myvar(2))
    for (i<-myvar){
      println(i)
    }
    var myvarr2=Array(1,2,3,4)
    println(myvarr2)
  }
}

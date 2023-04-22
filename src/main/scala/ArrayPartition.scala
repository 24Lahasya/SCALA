object ArrayPartition {
  def main(args: Array[String]): Unit = {
    var a1=  Array(1,2,3,4,5,6,7)
    val  (even,odd)=a1.partition((p)=>{
      if(p%2==0){
         true;
      }else{
         false
      }
    })
    even.foreach(println(_))
    odd.foreach(println(_))
    val (even1,odd1)=a1.partition(_%2==0)
    even1.foreach(println(_))
    odd1.foreach(println(_))
  }
}

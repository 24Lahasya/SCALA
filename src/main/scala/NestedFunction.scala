object NestedFunction {
  def main(args: Array[String]): Unit = {
    findMinMax(1000000000000l,10000000000056l)
  }
    def findMinMax(i:Long,j:Long):Unit={
      def max(i:Long,j:Long):Unit={
        if(i>j){
          println(s"$i is max")
        }
      }

      def min(i: Long, j: Long): Unit = {
        if (i < j) {
          println(s"$j is max")
        }
      }
      max(i,j)
      min(i,j)
    }

  }


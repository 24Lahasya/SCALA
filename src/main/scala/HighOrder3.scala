object HighOrder3 {
def mathOperation(name:String):(Int,Int)=> Int=
  (x:Int,y:Int) =>{
    name match{
      case "addition"  =>x+y
      case "multipilcation"  =>x*y
      case "substraction"  =>x-y
      case "division"  =>x/y

    }
  }
}

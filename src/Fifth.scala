object Fifth {
  def main(args: Array[String]): Unit = {
    def func(x:Int, y:Int ,z:Int):Int={
      return (x*8)+(y*7)+(z*8)
    }
    println("The toatal run time is " + func(2,3,2))
  }
}

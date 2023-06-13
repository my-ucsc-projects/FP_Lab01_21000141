object Fourth {
  def main(args: Array[String]): Unit = {
    print("Please enter the books count: ")
    var count = scala.io.StdIn.readLine().toInt
    def cost(count:Int) : Double ={
      var cost = 0.0
      if (count > 50) {
        cost = (count * 24.95 * 0.6) + 3 + ((count - 50) * 0.75)
      }
      else {
        cost = (count * 24.95 * 0.6) + 3
      }
      return cost
    }

    println("The cost of the books is Rs."+cost(count))
  }
}

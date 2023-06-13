object Second {
  def main(args: Array[String]): Unit = {
    print("Please enter the temperature in celcius :")
    var celcius = scala.io.StdIn.readLine().toFloat
    def convert(c:Float): Double = {
      var faranhite = (celcius*1.8) +32
      return faranhite
    }

    println("The faranhite value of the "+celcius+"C is "+convert(celcius)+"F")
  }

}

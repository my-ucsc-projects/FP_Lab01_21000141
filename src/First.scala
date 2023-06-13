import scala.math._

object First {
  def main(args: Array[String]): Unit = {
    print("Please enter the radius of the disk :")
    var radius = scala.io.StdIn.readLine().toFloat
    def getradius(r:Float):Double ={
      var result = Pi * r * r
      return result
    }

    println(getradius(radius))
  }
}
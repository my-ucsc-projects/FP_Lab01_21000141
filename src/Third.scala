import scala.math._
object Third {
  def main(args: Array[String]): Unit = {
    print("Please enter the radius of the sphere :")
    var radius = scala.io.StdIn.readLine().toFloat
    def volume(r:Float): Double ={
      var volume = 4*Pi*r*r*r/3
      return volume
    }

    println("The volume of the sphere is "+volume(radius))
  }

}

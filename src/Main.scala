import scala.math._

object Main {
  def main(args: Array[String]): Unit = {
    print("Please enter the radius of the disk :")
    var radius = scala.io.StdIn.readLine().toInt
    var result = Pi * radius * radius
    println(result)
  }
}
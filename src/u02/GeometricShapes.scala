package u02

object GeometricShapes extends App {
  sealed trait Shape
  case class Rectangle(base: Int, high: Int) extends Shape
  case class Square(side: Int) extends Shape
  case class Circle(ray: Double) extends Shape


  def perimeter(shape: Shape): Double = shape match {
    case Rectangle(b,h) => (b+h)*2
    case _ => 0
  }




}




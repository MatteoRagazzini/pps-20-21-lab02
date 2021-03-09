package u02

object GeometricShapes extends App {
  sealed trait Shape
  case class Rectangle(base: Int, high: Int) extends Shape
  case class Square(side: Int) extends Shape
  case class Circle(ray: Double) extends Shape
}

  object GeometricFunctions extends App {

    def perimeter(shape: GeometricShapes.Shape): Double = shape match {
      case GeometricShapes.Rectangle(b, h) => (b + h) * 2
      case GeometricShapes.Square(s) => s * 4
      // assuming that for the circle the perimeter corresponds to circumference
      case GeometricShapes.Circle(r) => 2 * Math.PI * r
    }

  }








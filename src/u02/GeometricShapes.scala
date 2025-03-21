package u02

object GeometricShapes{
  sealed trait Shape
  case class Rectangle(base: Int, high: Int) extends Shape
  case class Square(side: Int) extends Shape
  case class Circle(ray: Double) extends Shape
}

  object GeometricFunctions{

    def perimeter(shape: GeometricShapes.Shape): Double = shape match {
      case GeometricShapes.Rectangle(b, h) => (b + h) * 2
      case GeometricShapes.Square(s) => s * 4
      case GeometricShapes.Circle(r) => 2 * Math.PI * r
    }

    def area(shape: GeometricShapes.Shape): Double = shape match {
      case GeometricShapes.Rectangle(b, h) => b * h
      case GeometricShapes.Square(s) => Math.pow(s,2)
      case GeometricShapes.Circle(r) => Math.PI * Math.pow(r,2)
    }

  }








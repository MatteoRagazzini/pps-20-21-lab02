package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.GeometricShapes._

class GeometricShapesTest {

  val rectangle: Rectangle = Rectangle(2,3)
  val square: Square = Square(2)
  val circle: Circle = Circle(1)


  @Test
  def testPerimeter(): Unit ={
    assertEquals(10,GeometricFunctions.perimeter(rectangle))
    assertEquals(8,GeometricFunctions.perimeter(square))
    assertEquals(6.2832,GeometricFunctions.perimeter(circle), 0.0001)
  }

  @Test
  def testArea(): Unit ={
    assertEquals(6,GeometricFunctions.area(rectangle))
    assertEquals(4,GeometricFunctions.area(square))
    assertEquals(3.14159,GeometricFunctions.area(circle), 0.0001)
  }

}

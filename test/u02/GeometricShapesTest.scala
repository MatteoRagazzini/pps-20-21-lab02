package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.GeometricShapes.{Circle, Rectangle, Square}

class GeometricShapesTest {

  @Test
  def testPerimeter(): Unit ={
    assertEquals(10,GeometricFunctions.perimeter(Rectangle(2,3)))
    assertEquals(8,GeometricFunctions.perimeter(Square(2)))
    assertEquals(6.2832,GeometricFunctions.perimeter(Circle(1)), 0.0001)
  }

  @Test
  def testArea(): Unit ={
    assertEquals(6,GeometricFunctions.area(Rectangle(2,3)))
    assertEquals(4,GeometricFunctions.area(Square(2)))
    assertEquals(3.14159,GeometricFunctions.area(Circle(1)), 0.0001)
  }

}

package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.GeometricShapes.{Rectangle, perimeter}

class GeometricShapesTest {

  @Test
  def testPerimeter(): Unit ={
    assertEquals(10,perimeter(Rectangle(2,3)))
  }

}

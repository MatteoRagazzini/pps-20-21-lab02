package u02
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.HelloScala.parity

class HelloScalaTest {
  import u02.HelloScala


  @Test def testEven(): Unit ={
    assertEquals("even", parity(2))
  }

  @Test def testOdd(): Unit ={
    assertEquals("odd", parity(3))
  }



}

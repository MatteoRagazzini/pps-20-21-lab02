package u02
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.HelloScala._

class HelloScalaTest {


  @Test def testEven(): Unit ={
    assertEquals("even", parity(2))
  }

  @Test def testOdd(): Unit ={
    assertEquals("odd", parity(3))
  }

  @Test def testEvenLambda(): Unit ={
    assertEquals("even", parityLambda(2))
  }

  @Test def testOddLambda(): Unit ={
    assertEquals("odd", parityLambda(3))
  }

  @Test def testNeg(): Unit ={
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))
  }

  @Test def testNegative(): Unit ={
    assertTrue(notEmptyWithLambdas("foo"))
    assertFalse(notEmptyWithLambdas(""))
    assertTrue(notEmptyWithLambdas("foo") && !notEmpty(""))
    assertTrue(odd(3))
  }





}

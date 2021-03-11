package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.ComposeFunctions.{compose, genericsCompose}
class ComposeFunctionsTest {

  val not:Boolean => String = {
    case true => "false"
    case _ => "true"
  }

  val greaterThenZero:Int => Boolean = x =>  x > 0


  @Test def ComposeTest(): Unit ={
    assertEquals(9, compose(_-1,_*2)(5))
  }

  @Test def genericsComposeTest(): Unit ={
    assertEquals("false", genericsCompose(not, greaterThenZero)(5))
  }

}

package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Optionals.Option.{map, _}
class OptionalsTest {

  val less = (a: Int, b: Int) => a<b match {  //None
    case true => "less"
    case _ => "greater"
  }

  @Test def filterTest(): Unit ={
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
  }

  @Test def mapTest(): Unit ={
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(None(), map(None[Int]())(_ > 2))
  }

  @Test def map2Test(): Unit ={
    assertEquals(None(), map2(None[Int]())(Some(5))(less))
    assertEquals(Some("less"), map2(Some(3))(Some(5))(less))
  }
}

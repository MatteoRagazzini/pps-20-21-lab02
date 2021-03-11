package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.Currying._

class CurryingTest {

  @Test def multiplicationTest(): Unit ={
    assertEquals(20, multiplication(10,2))
  }
  
  @Test def curriedMultiplicationTest(): Unit ={
    assertEquals(20, curriedMultiplication(10)(2))
  }

  @Test def twiceTest(): Unit ={
    assertEquals(20, twice(10))
  }

  @Test def curriedMultiplicationAsFunctionTest(): Unit ={
    assertEquals(20, curriedMultiplicationAsFunction(10)(2))
  }

  //---------- My tests-------------

  @Test def curriedPredicateTest(): Unit ={
    assertTrue(curriedPredicate(5)(10)(20))
  }

  @Test def nonCurriedPredicateTest(): Unit ={
    assertTrue(nonCurriedPredicate(5, 10, 20))
  }

  @Test def curriedPredicateAsFunctionTest(): Unit ={
    assertTrue(curriedPredicateAsFunction(5)(10)(20))
  }

  @Test def nonCurriedPredicateAsFunctionTest(): Unit ={
    assertTrue(nonCurriedPredicateAsFunction(5, 10, 20))
  }
}

package u02

object Currying extends App {

  // standard function with no currying
  def mult(x: Double, y: Double): Double = x*y

  // function with currying
  // curriedMult has actually type: Double => (Double => Double)
  def curriedMult(x: Double)(y: Double): Double = x*y

  def curriedPred(x: Double)(y: Double)(z: Double):Boolean = x match {
    case x if x<=y => y<=z
    case _ => false
  }

  def nonCurriedPred(x:Double, y:Double, z:Double):Boolean = x<=y && y<= z

  val nonCurriedPredAsFunction = (x:Double, y:Double, z:Double) => x<=y && y<= z

  val CurriedPredAsFunction: Double => Double => Double => Boolean = x => y => z =>  x<=y && y<=z

  // slightly different syntax at the call side..
  println(mult(10,2)) // 20
  println(curriedMult(10)(2)) // 20

  // curriedMult can be partially applied!
  val twice: Double => Double = curriedMult(2)

  println(twice(10)) // 20

  // => is right-associative, hence it is equal to:
  //val curr...: Double => (Double => Double) = x => (y => x*y)
  val curriedMultAsFunction: Double => Double => Double = x => y => x*y

  println(curriedMultAsFunction(10)(2)) // 20
  println(curriedMultAsFunction) // u02.Currying$$$Lambda$7/...
  println(curriedMultAsFunction(10)) // u02.Currying$$$Lambda$12/...
  println("curried pred is"+ curriedPred(5)(10)(20))
  println("nonCurriedPred is" + (5,10,20))
  println("nonCurriedPredAsFunciton is" + nonCurriedPredAsFunction(5,10,20))
  println("CurriedPredAsFunciton is" + CurriedPredAsFunction(5)(10)(20))

}

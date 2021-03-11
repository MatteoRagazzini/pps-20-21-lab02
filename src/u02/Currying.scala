package u02

object Currying extends App {

  def multiplication(x: Double, y: Double): Double = x*y

  def curriedMultiplication(x: Double)(y: Double): Double = x*y

  lazy val twice: Double => Double = curriedMultiplication(2)

  lazy val curriedMultiplicationAsFunction: Double => Double => Double = x => y => x*y

  // -------- Added Functions - Ex 2b currying -------------------------
  def curriedPredicate(x: Double)(y: Double)(z: Double):Boolean = x match {
    case x if x<=y => y<=z
    case _ => false
  }

  lazy val curriedPredicateAsFunction: Double => Double => Double => Boolean = x => y => z =>  x<=y && y<=z

  def nonCurriedPredicate(x:Double, y:Double, z:Double):Boolean = x<=y && y<=z

  lazy val nonCurriedPredicateAsFunction = (x:Double, y:Double, z:Double) => x<=y && y<=z


}

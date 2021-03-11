package u02

object Parity extends App {
  def parity(x: Int): String = x match {
    case x if x % 2 == 0 => "even"
    case _ => "odd"
  }

  lazy val parityLambda: Int => String = {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }

  lazy val negative: (String => Boolean) => String => Boolean = predicate => !predicate(_)


  def neg[A](predicate: A => Boolean): A => Boolean = predicate match {
    case _ => !predicate(_)
  }
}

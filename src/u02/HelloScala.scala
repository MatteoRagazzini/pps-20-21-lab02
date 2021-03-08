package u02

object HelloScala extends App {
  def parity(x: Int): String = x match {
    case x if x % 2 == 0 => "even"
    case _ => "odd"
  }

  //permette di istanziare val senza l'esecuzione
  lazy val parityLambda: Int => String = {
    case n if n%2 == 0 => "even"
    case _ => "odd"
  }

  lazy val negative: (String => Boolean) => String => Boolean = predicate => !predicate(_)


  def neg[A](predicate: A => Boolean): A => Boolean = predicate match {
    case _ => !predicate(_)
  }

  println(parityLambda(2))

  lazy val empty: String => Boolean = _==""
  lazy val notEmpty = neg(empty)

  lazy val even: Int => Boolean = _%2==0
  lazy val odd = neg(even)

  lazy val notEmptyWithLambdas = negative(empty)





}

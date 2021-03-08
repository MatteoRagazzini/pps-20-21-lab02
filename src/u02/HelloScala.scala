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

  lazy val negative: (String => Boolean) => String => Boolean = predicate => predicate match{
    case _ => !predicate(_)
  }


  def neg(predicate: String => Boolean): String => Boolean = predicate match {
    case _ => !predicate(_)
  }

  println(parityLambda(2))

  lazy val empty: String => Boolean = _==""
  lazy val notEmpty = neg(empty)

  lazy val notEmptyWithLambdas = negative(empty)





}

package u02

object HelloScala extends App {
  def parity(x: Int): String = x match {
    case x if x % 2 == 0 => "even"
    case _ => "odd"
  }

}

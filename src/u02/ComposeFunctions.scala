package u02

object ComposeFunctions extends App {

  def compose(f: Int => Int, g:Int => Int):Int =>Int = {
    x =>f(g(x))
  }

  def genericsCompose[A,B,C](f:B=>C, g:A=>B):A=>C = {
    x =>f(g(x))
  }
}

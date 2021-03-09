package u02

import java.util.stream.DoubleStream

object DefinedFunctions extends App {

  def compose(f: Int => Int, g:Int => Int):Int =>Int = {
    x =>f(g(x))
  }

  def genericsCompose[T](f:T=>T, g:T=>T):T=>T = {
    x =>f(g(x))
  }

  println(compose(_-1,_*2)(5))
  //println(genericsCompose((s:String)=> _ + "casa", (s:String)=> _ + "casa")("bella"))


  def fib(n: Int): Int = n match{
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1) + fib(n-2)
  }

  println((fib(0),fib(1),fib(2),fib(3),fib(4)));



  // defined function
  def square(d: Double): Double = d*d
  println(square(3.0)) // 9.0

  // mostly equivalent code with a val
  val square2: Double => Double = d => d*d
  println(square2(3.0)) // 9.0

  // defined function, using pattern matching, with recursion
  def factorial(n: Int): Int = n match {
    case 0 | 1 => 1   // 0 or 1 gets mapped to 1
    case _ => n * factorial(n - 1)  // otherwise
  }
  println(factorial(6)) // 720

  // nested function
  def abs(n: Int): Int = {
    def sign(m:Int):Int = m match {
      case i if i>0 => 1
      case 0 => 0; case _ => -1
    }
    n * sign(n)
  }
  println(abs(-2),abs(2),abs(0)) // 2,2,0

  // tail recursion check, as a nested function
  def factorial2(n: Int): Int = {
    @annotation.tailrec  // checks only if optimisation is possible
    def _fact(n: Int, acc: Int): Int = n match {
      case 0 | 1 => acc
      case _ => _fact (n - 1, n * acc)
    }
    _fact(n, 1)
  }
  println(factorial2(6)) // 720
}

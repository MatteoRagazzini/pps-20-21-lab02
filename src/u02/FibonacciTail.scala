package u02

object FibonacciTail extends App{

  def fib(n: Int):Int = {
    @annotation.tailrec
    def _fib(n: Int, prev: Int, current: Int): Int = n match {
      case 0 => current;
      case _ => _fib(n-1,prev = prev + current, current = prev)
    }
    _fib(n,prev = 1, current = 0)
  }

  println((fib(0),fib(1),fib(2),fib(3),fib(4)))
}

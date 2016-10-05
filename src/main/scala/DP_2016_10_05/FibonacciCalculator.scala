package DP_2016_10_05

import scala.annotation.tailrec
import scala.collection.mutable

object FibonacciCalculator {
  def fibonacciTo(ceiling: Int): mutable.Queue[BigInt] = {
    val fibonacciSequence = new mutable.Queue[BigInt]()
    var count = 0
    var fibNum:BigInt = 0

    while(fibNum <= ceiling) {
      fibNum = getFibonacciNumber(count)
      if (fibNum < ceiling) fibonacciSequence += fibNum
      count += 1
    }
    fibonacciSequence
  }

  private def getFibonacciNumber(number: Int) = {
    @tailrec
    def fibonacci(x: Int, previous: BigInt = 0, next: BigInt = 1): BigInt = x match {
      case 0 => previous
      case 1 => next
      case _ => fibonacci(x - 1, next, previous + next)
    }
    fibonacci(number)
  }
}

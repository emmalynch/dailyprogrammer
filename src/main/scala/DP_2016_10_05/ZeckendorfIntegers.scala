package DP_2016_10_05

import DP_2016_10_05.FibonacciCalculator.fibonacciTo

import scala.collection.mutable

/**
  * Zeckendorf's theorem states that every positive integer
  * can be represented uniquely as the sum of one or more distinct
  * Fibonacci numbers in such a way that the sum does not include
  * any two consecutive Fibonacci numbers.
  */
object ZeckendorfIntegers {


  def getGreedyZeckendorfRepresentationOf(target: Int): List[BigInt] = {

    val fibonacciSequence = fibonacciTo(target).reverse
    val result: mutable.Queue[BigInt] = new mutable.Queue[BigInt]()

    while(sumElements(result) != target){
      pruneFibonacci(fibonacciSequence, sumElements(result), target)
      result += (fibonacciSequence(0))
      fibonacciSequence.dequeue
    }
    result.toList
  }

  private def pruneFibonacci(fibonacciSequence: mutable.Queue[BigInt], currentTotal: BigInt, target: BigInt) = {
    while (currentTotal + fibonacciSequence(0) > target) {
      fibonacciSequence.dequeue()
    }
  }

  private def sumElements(queue: mutable.Queue[BigInt]): BigInt = {
    if(queue.nonEmpty)
      queue.reduceLeft((_ + _))
    else 0
  }

}

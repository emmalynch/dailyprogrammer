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


  def getGreedyZeckendorfRepresentationOf(input: Int, depth: Int): List[BigInt] = {

    val fibonnaciSequence = fibonacciTo(input).reverse
    val result: mutable.Queue[BigInt] = new mutable.Queue[BigInt]()

    var runningTotal: BigInt = 0

    for(i <- 1 to depth) {
      while(runningTotal + fibonnaciSequence(0) > input){
         fibonnaciSequence.dequeue()
      }
      result += (fibonnaciSequence(0))
      runningTotal += fibonnaciSequence(0)
      fibonnaciSequence.dequeue
    }
    result.toList
  }
}

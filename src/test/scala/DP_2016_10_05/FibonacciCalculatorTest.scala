package DP_2016_10_05

import org.scalatest.{FlatSpec, Matchers}

class FibonacciCalculatorTest extends FlatSpec with Matchers{

  it should "calculate the Fibonacci sequence to a given number" in {
    FibonacciCalculator.fibonacciTo(100) shouldBe List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
  }
}

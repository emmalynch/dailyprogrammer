import scala.annotation.tailrec

object Factorial {

  def factorial(input: Int): Int = {
    if(input == 1)
      input
    else
      input * factorial(input - 1)
  }

  @tailrec
  def factorialTailRec(input: Int, accumulator: Int): Int = {
    if (input == 1)
      accumulator
    else
      factorialTailRec(input - 1, accumulator * input)
  }

  @tailrec
  def reverseFactorial(input: Int, divisor: Int = 1): Option[Int] = {
    if(input % divisor != 0)
      None
    else {
      val attempt = input / divisor
      if(attempt == 1)
        Some(divisor)
      else
        reverseFactorial(attempt, divisor + 1)
    }
  }
}
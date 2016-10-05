import org.scalatest.{FlatSpec, Matchers}

class FactorialTest extends FlatSpec with Matchers {

  it should "calculate the factorial correctly" in {
    val result = Factorial.factorial(5)
    result shouldBe 120
  }

  it should "calculate the factorial using tail recursion" in {
    val result = Factorial.factorialTailRec(5, 1)
    result shouldBe 120
  }

  it should "calculate the factorial from the result" in {
    val result = (
      Factorial.reverseFactorial(3628800),
      Factorial.reverseFactorial(479001600),
      Factorial.reverseFactorial(6),
      Factorial.reverseFactorial(18),
      Factorial.reverseFactorial(0),
      Factorial.reverseFactorial(-1))
    result shouldBe (Some(10), Some(12), Some(3), None, None, None)
  }
}

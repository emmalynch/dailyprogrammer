package DP_2016_10_05

import org.scalatest.{FlatSpec, Matchers}

class ZeckendorfIntegersTest extends FlatSpec with Matchers {

  it should "calculate the Zeckindorf representation of any number to a given depth" in {
    ZeckendorfIntegers.getGreedyZeckendorfRepresentationOf(100) shouldBe List(89, 8, 3)
  }
}

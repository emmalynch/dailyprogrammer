package DP_2016_09_12

import org.scalatest.{FlatSpec, Matchers}
import AnagramDetector.isAnagram

class AnagramDetectorTest extends FlatSpec with Matchers{

  it should "correctly detect anagrams" in {
    isAnagram("wisdom", "mid sow") shouldBe true
    isAnagram("Seth Rogan", "Gathers No") shouldBe true
    isAnagram("Reddit", "Eat Dirt") shouldBe false
    isAnagram("Schoolmaster", "The classroom") shouldBe true
    isAnagram("Astronomers", "Moon starer") shouldBe false
    isAnagram("Vacation Times", "I'm Not as Active") shouldBe true
    isAnagram("Dormitory", "Dirty Rooms") shouldBe false
    isAnagram("Old Man", "Man Old") shouldBe false
  }
}

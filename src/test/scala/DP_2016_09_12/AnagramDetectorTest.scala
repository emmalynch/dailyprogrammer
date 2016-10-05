package DP_2016_09_12

import org.scalatest.{FlatSpec, Matchers}

class AnagramDetectorTest extends FlatSpec with Matchers{

  it should "correctly detect anagrams" in {
    AnagramDetector.isAnagram("wisdom", "mid sow") shouldBe true
    AnagramDetector.isAnagram("Seth Rogan", "Gathers No") shouldBe true
    AnagramDetector.isAnagram("Reddit", "Eat Dirt") shouldBe false
    AnagramDetector.isAnagram("Schoolmaster", "The classroom") shouldBe true
    AnagramDetector.isAnagram("Astronomers", "Moon starer") shouldBe false
    AnagramDetector.isAnagram("Vacation Times", "I'm Not as Active") shouldBe true
    AnagramDetector.isAnagram("Dormitory", "Dirty Rooms") shouldBe false
  }
}

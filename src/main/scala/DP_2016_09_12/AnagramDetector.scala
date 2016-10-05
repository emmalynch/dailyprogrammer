package DP_2016_09_12

object AnagramDetector {

  def isAnagram(input: String, anagram: String): Boolean = {
    val strippedInput = input.replaceAll("[^a-zA-Z]", "")
    val strippedAnagram = anagram.replaceAll("[^a-zA-Z]", "")

    strippedInput.size == strippedAnagram.size &&
      strippedInput.toLowerCase.sortWith(_ < _) == strippedAnagram.toLowerCase.sortWith(_ < _)
  }
}

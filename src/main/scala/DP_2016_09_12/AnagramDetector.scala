package DP_2016_09_12

object AnagramDetector {

  def isAnagram(input: String, anagram: String): Boolean = {

    val inputLetters = input.filter(_.isLetter).toLowerCase
    val anagramLetters = anagram.filter(_.isLetter).toLowerCase

    inputLetters.size == anagramLetters.size &&
      inputLetters.sorted == anagramLetters.sorted &&
        input.toLowerCase.split(" ").sorted.deep != anagram.toLowerCase.split(" ").sorted.deep
  }
}

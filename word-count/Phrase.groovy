class Phrase{
  String phrase

  def Phrase(input) {
    phrase = input
  }

  def wordCount(){
    def count = [:]

    def words = phrase.replaceAll(/[^a-zA-Z0-9']+/," ").split(" ")
    words.each { word ->
      if (word) {
        count[word.trim().toLowerCase()] = 0
      }
    }
    words.each { word ->
      if (word){
      count[word.trim().toLowerCase()] += 1
      }
    }
    return count
  }
}

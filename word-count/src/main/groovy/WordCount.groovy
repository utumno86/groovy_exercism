class WordCount{
  String phrase

  def WordCount(input) {
    phrase = input
  }

  def wordCount(){
    def words = phrase.replaceAll("([^A-Za-z0-9']+|\\B'|'\\B)", " ").split(" ")
    def normalized_words = words.findAll {it != ""}
    normalized_words.countBy { word ->
        word.toLowerCase()
    }
  }
}
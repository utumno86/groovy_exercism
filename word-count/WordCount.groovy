class WordCount{
  String phrase

  def WordCount(input) {
    phrase = input
  }

  def wordCount(){
    def words = phrase.replaceAll(/[^a-zA-Z0-9']+/," ").split(" ")
    words.countBy { word ->
      word.toLowerCase()
    }
  }
}

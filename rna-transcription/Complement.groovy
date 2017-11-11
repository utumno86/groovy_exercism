class Complement{

  def dnaMap = [
    "C":"G",
    "G":"C",
    "T":"A",
    "A":"U"
  ].withDefault{k -> throw new IllegalArgumentException("$k is not a valid Dna strand") }

  def ofDNA(input){
    input.collect{ letter ->
      dnaMap[letter]
    }.join('')
  }
}

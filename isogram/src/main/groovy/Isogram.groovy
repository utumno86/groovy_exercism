class Isogram {
    static boolean isIsogram(String phrase) {
        def nomralizedChars = phrase.toLowerCase().toCharArray().findAll{ it.isLetter() }
        nomralizedChars.toSet().size() == nomralizedChars.size()
    }
}
class Isogram {
    static boolean isIsogram(String phrase) {
        return phrase.toLowerCase().toCharArray().findAll{ it.isLetter() }.toSet().size() == phrase.toCharArray().findAll{ it.isLetter() }.size()
    }
}
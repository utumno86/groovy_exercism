class Anagram {
    private final subject

    Anagram(subject) {
        this.subject = subject
    }

    def find(candidates) {
        def subjectChars = normalize(this.subject)
        candidates.findAll{ candidate ->
            normalize(candidate) == subjectChars && candidate.toLowerCase() != this.subject.toLowerCase()
        }
    }

    def normalize(word) {
        word.toLowerCase().split('').sort()
    }
}
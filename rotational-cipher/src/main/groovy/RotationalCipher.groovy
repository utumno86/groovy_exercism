class RotationalCipher {
    private final int key

    RotationalCipher(int key) {
        this.key = key
    }

    String rotate(String cipherText) {
        cipherText.collect{ c ->
            def character = c as Character
            def ascii = character as Integer
            def new_char = ascii
            if (character.isLetter()){
                new_char = ascii + this.key
                if ((character.isLowerCase() && new_char > 122) || (character.isUpperCase() && new_char > 90)) {
                    new_char = new_char - 26
                }
            }
            new_char as Character
        }.join('')
    }
}

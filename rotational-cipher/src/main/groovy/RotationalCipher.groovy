class RotationalCipher {
    private int key

    RotationalCipher(int key) {
        this.key = key
    }

    public String rotate(String cipherText) {
        def ciphered_string = ''
        cipherText.each{ c ->
            def character = c as Character
            def ascii = character as Integer
            def new_char
            if (character.isLetter()){
                new_char = ascii + this.key
                if ((character.isLowerCase() && new_char > 122) || (character.isUpperCase() && new_char > 90)) {
                    new_char = new_char - 26
                }
            } else {
                new_char = ascii
            }
            ciphered_string += new_char as Character
        }
        ciphered_string
    }
}

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
            def new_char = ascii + this.key
            ciphered_string += new_char as Character
        }
        ciphered_string
    }
}

class SecretHandshake {

    static secrets = ['wink', 'double blink', 'close your eyes', 'jump']

    static List<String> commands(int number) {
        def reversedBinary = calculateBinary(number)
        def handshake = []
        def reversed = false

        reversedBinary.eachWithIndex{ bit, index ->
            def tempIndex = index
            if (tempIndex == 4){
                reversed = true
            }
            while (tempIndex >= 4){
                tempIndex -= 4
            }
            if (bit.toInteger() == 1){
                if (!(handshake.contains(secrets[tempIndex]))){
                    handshake << secrets[tempIndex]
                }
            }
        }

        return reversed ? handshake.reverse() : handshake
    }

    static public String calculateBinary(int number){
        println number
        def binary = ""
        while(number > 0){
            binary += (number%2).toString()
            number /= 2
        }
        return binary
    }
}


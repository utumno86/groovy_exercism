class ArmstrongNumber {

    static isArmstrongNumber(number) {
        def sum = 0
        "$number".collect { it as Integer }.each { digit ->
            sum += digit ** number.toString().length()
        }
        return sum == number
    }

}
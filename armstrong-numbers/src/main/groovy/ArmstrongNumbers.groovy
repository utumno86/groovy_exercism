class ArmstrongNumber {

    static isArmstrongNumber(number) {
        def numberLength = number.toString().length()
        number == "$number".collect { (it as Integer) ** numberLength }.sum(0)
    }

}
class NthPrime {
  static nth(input){
    if (input < 1){
      throw new ArithmeticException("The input $input is less than 1")
      return
    }
    def primeList = [2, 3]
    def index = primeList.last() == 2 ? 3 : primeList.last()
    while (primeList.size() < input + 1){
      def isPrime = true
      primeList.each { prime ->
        if (index % prime == 0){
          isPrime = false
        }
      }

      if (isPrime){
        primeList << index
      }

      index += 2
    }
    primeList[input -1]
  }
}
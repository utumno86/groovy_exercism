class DifferenceOfSquares {
  def input

  def DifferenceOfSquares(number){
    this.input = (1..number)
  }

  def squareOfSum(){
    input.sum()**2
  }

  def sumOfSquares(){
    input.collect{it**2}.sum()
  }

  def difference(){
    squareOfSum() - sumOfSquares()
  }
}
class Squares {
  def input

  def Squares(number){
    this.input = (1..number)
  }

  def squareOfSums(){
    input.sum()**2
  }

  def sumOfSquares(){
    input.collect{it**2}.sum()
  }

  def difference(){
    squareOfSums() - sumOfSquares()
  }
}
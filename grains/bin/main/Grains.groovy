class Grains {
  def square(numberOfSquares){
    2 ** (numberOfSquares - 1)
  }
  def total() {
    square(65) - 1
  }
}
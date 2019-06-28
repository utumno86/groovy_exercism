class Leap {

  Integer input

  Year(Integer year) {
    this.input = year
  }

  def isLeapYear(){
    (input % 4 == 0 && input % 100 != 0) || (input % 400 == 0)
  }
}
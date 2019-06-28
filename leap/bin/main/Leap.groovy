class Leap {

  Integer input

  Leap(Integer year) {
    this.input = year
  }

  def isLeapYear(){
    (input % 4 == 0 && input % 100 != 0) || (input % 400 == 0)
  }
}
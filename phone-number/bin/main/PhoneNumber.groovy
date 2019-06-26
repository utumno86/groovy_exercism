class PhoneNumber {
  def number = ""
  def areaCode = ""

  def PhoneNumber(input){
    def characters = ["(",")","-","."," ", "+"]
    number = input
    characters.each { character ->
      number = number.replace(character,"")
    }

    if (number =~ /[a-zA-Z!:@]/){
      number = "0000000000"
    }
    if (number.length() == 9){
      number = "0000000000"
    }
    if (number.length() == 11){
      if(number[0] == '1'){
        number = number[1..-1]
      } else {
        number = "0000000000"
      }
    }
    if (number.length() > 11){
      number = "0000000000"
    }
    if (number[0] == '0'|| number[0] == '1'){
      number = "0000000000"
    }
    if (number[3] == '0'|| number[3] == '1'){
      number = "0000000000"
    }
    areaCode = number[0..2]
  }

  String getNumber(){ number }
  String toString(){"($areaCode) ${number[3..5]}-${number[6..9]}"}
}
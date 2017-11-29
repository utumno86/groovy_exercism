class Roman {
  def Roman() {
		Integer.metaClass.toRoman = {->
			def NUMERAL_CONVERSION = [
	    	'M' : 1000,
	    	'CM' : 900,
	    	'D' : 500,
	    	'CD' : 400,
	    	'C' : 100,
	    	'XC' : 90,
	    	'L' : 50,
	    	'XL' : 40,
	    	'X' : 10,
	    	'IX' : 9,
	    	'V' : 5,
	    	'IV' : 4,
	    	'I' : 1
	  	]
			def num = delegate
			def numerals = ""

			NUMERAL_CONVERSION.each { letter, number ->
				while (num >= number){
					numerals += letter
					num -= number
				}
			}
			numerals
		}
	}
}
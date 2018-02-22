class RomanNumerals {
	def RomanNumerals() {
		Integer.metaClass.getRoman = {->
			def NUMERAL_CONVERSION = [
				['M', '1000'],
				['CM', '900'],
				['D', '500'],
				['CD', '400'],
				['C', '100'],
				['XC', '90'],
				['L', '50'],
				['XL', '40'],
				['X', '10'],
				['IX', '9'],
				['V', '5'],
				['IV', '4'],
				['I', '1']
			]
			def num = delegate
			def numerals = ""

			NUMERAL_CONVERSION.each { keyValue ->
				while (num >= (keyValue[1] as Integer)){
					numerals += keyValue[0]
					num -= keyValue[1] as Integer
				}
			}
			numerals
		}
	}
}

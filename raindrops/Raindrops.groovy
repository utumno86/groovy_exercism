class Raindrops {
	def convert(input){
		def output = ""
		if (input % 3 == 0) { output += "Pling" }
		if (input % 5 == 0) { output += "Plang" }
		if (input % 7 == 0) { output += "Plong" }
		if (!output) { output = input.toString() }
		output
	}
}

class Hamming {
	def compute(string1, string2){
		[string1.toCharArray(), string2.toCharArray()].transpose().count {i, j -> i != j}
	}
}
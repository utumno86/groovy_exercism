class Hamming {
	def distance(string1, string2){
		if (string1.size() != string2.size()) {
        throw new ArithmeticException()
    }
		[string1.toCharArray(), string2.toCharArray()].transpose().count {i, j -> i != j}
	}
}
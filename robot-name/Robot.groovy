class Robot {
	def alphaPart = "A".."Z" as ArrayList
	def seed = new Random()
	String name

	def Robot() {
    reset()
  }

	def reset() {
		name = ""

		Collections.shuffle(alphaPart)
		0.upto(1){
			name += alphaPart.pop()
		}
		0.upto(2){
			name += seed.nextInt(10)
		}
 }

}

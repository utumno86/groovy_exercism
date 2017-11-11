import groovy.time.TimeCategory

class Gigasecond {
	def from(startDate){
		use (TimeCategory) {
			return startDate + (10**9).seconds
		}
	}
}

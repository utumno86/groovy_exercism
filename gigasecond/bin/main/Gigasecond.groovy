import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {
	def add(LocalDate startDate){
		startDate.atTime(0,0).plusSeconds(10**9)
	}

	def add(LocalDateTime startDate){
		startDate.plusSeconds(10**9)
	}
}
import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {

	static LocalDateTime add(LocalDate startDate){
		def startDateTime = startDate.atStartOfDay()
		startDateTime.plusSeconds(10**9)
	}

	static LocalDateTime add(LocalDateTime startDateTime){4
		startDateTime.plusSeconds(10**9)
	}
}
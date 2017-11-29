@Grab('org.spockframework:spock-core:1.0-groovy-2.4')
import spock.lang.*

class RaindropsSpec extends Specification {

    @Shared
    def raindrops = new Raindrops()

    def '1 returns 1'() {
        expect: raindrops.convert(1) == '1'
    }

    def '3, being divisible by 3, returns "Pling"'() {
        expect: raindrops.convert(3) == 'Pling'
    }

    def '5, divisible by 5, returns "Plang"'() {
        expect: raindrops.convert(5) == 'Plang'
    }

    def '7, divisible by 7, returns "Plong"'() {
        expect: raindrops.convert(7) == 'Plong'
    }

    def '6, divisible by 3, returns "Pling"'() {
        expect: raindrops.convert(6) == 'Pling'
    }

    def '8 returns the string "8"'() {
        expect: raindrops.convert(8) == '8'
    }

    def '9, divisible by 3, returns "Pling"'() {
        expect: raindrops.convert(9) == 'Pling'
    }

    def '10, divisible by 5, returns "Plang"'() {
        expect: raindrops.convert(10) == 'Plang'
    }

    def '14, divisible by 7, returns "Plong"'() {
        expect: raindrops.convert(14) == 'Plong'
    }

    def '15, divisible by both 3 and 5, returns "PlingPang"'() {
        expect: raindrops.convert(15) == 'PlingPlang'
    }

    def '21, divisible by 3 and 7, returns "PlingPlong"'() {
        expect: raindrops.convert(21) == 'PlingPlong'
    }

    def '25, divisible by 5, returns "Plang"'() {
        expect: raindrops.convert(25) == 'Plang'
    }

    def '27, divisible by 3, returns "Pling"'() {
        expect: raindrops.convert(27) == 'Pling'
    }

    def '35, divisible by 5 and 7, returns "PlangPlong"'() {
        expect: raindrops.convert(35) == 'PlangPlong'
    }

    def '49, divisible by 7, returns "Plong"'() {
        expect: raindrops.convert(49) == 'Plong'
    }

    def '52 returns the string "52"'() {
        expect: raindrops.convert(52) == '52'
    }

    def '105 returns "PlingPlangPlong"'() {
        expect: raindrops.convert(105) == 'PlingPlangPlong'
    }

    def '3125, divisible by 5, returns "Plang"'() {
        expect: raindrops.convert(3125) == 'Plang'
    }

}

import spock.lang.*

class GrainsSpec extends Specification {

    @Shared
    def grains = new Grains()

    def "Square of 1"() {
        expect:
        grains.square(square) == expected

        where:
        square || expected
        1      || 1
    }


    def "Square of 2"() {
        expect:
        grains.square(square) == expected

        where:
        square || expected
        2      || 2
    }


    def "Square of 3"() {
        expect:
        grains.square(square) == expected

        where:
        square || expected
        3      || 4
    }


    def "Square of 4"() {
        expect:
        grains.square(square) == expected

        where:
        square || expected
        4      || 8
    }


    def "Square of 16"() {
        expect:
        grains.square(square) == expected

        where:
        square || expected
        16     || 32768
    }


    def "Square of 32"() {
        expect:
        grains.square(square) == expected

        where:
        square || expected
        32     || 2147483648
    }


    def "Square of 64"() {
        expect:
        grains.square(square) == expected

        where:
        square || expected
        64     || 9223372036854775808
    }


    def "Test total"() {
        expect:
        grains.total() == 18446744073709551615
    }
}
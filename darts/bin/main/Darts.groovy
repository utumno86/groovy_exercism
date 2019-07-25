class Darts {

    static int score(x, y) {
       def distance = Math.sqrt(x**2 + y**2)

       switch(distance){
            case { it <= 10 && it > 5 }:
                return 1
                break
            case { it <=5 && it > 1 }:
                return 5
                break
            case { it <= 1 }:
                return 10
                break
            default:
                return 0
       }
    }
}
class Triangle {

    static boolean isEquilateral(Number a, Number b, Number c) {
      a == b && b == c && a > 0 && passesTriangleEquality(a, b, c)
    }

    static boolean isIsosceles(Number a, Number b, Number c) {
      (a == b || a == c || b == c) && allSidesNonZero(a, b, c) && passesTriangleEquality(a, b, c)
    }

    static boolean isScalene(Number a, Number b, Number c) {
      [a, b, c].unique().size() == 3 && allSidesNonZero(a, b, c) && passesTriangleEquality(a, b, c)
    }

    public static passesTriangleEquality(Number a, Number b, Number c){
      a + b + c >= 2 * [a, b, c].max()
    }

    public static allSidesNonZero(Number a, Number b, Number c){
      ![a, b, c].any { it <= 0 }
    }

}

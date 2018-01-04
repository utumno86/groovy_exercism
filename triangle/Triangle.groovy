class Triangle {

    static boolean isEquilateral(Number a, Number b, Number c) {
        if(a == b && a == c && b == c && a != 0 && b != 0 && c != 0){
          return true
        }
    }

    static boolean isIsosceles(Number a, Number b, Number c) {
      if((a == b || a == c || b == c) && a != 0 && b != 0 && c != 0 && passesTriangleEquality(a, b, c)){
        return true
      }
    }

    static boolean isScalene(Number a, Number b, Number c) {
        if(a != b && a != c && b != c && a != 0 && b != 0 && c != 0 && passesTriangleEquality(a, b, c) ){
          return true
        }
    }

    public static passesTriangleEquality(Number a, Number b, Number c){
      def largestSide = a
      def smallerSide1 = b
      def smallerSide2 = c

      if(largestSide < b){
        largestSide = b
        smallerSide1 = a
        smallerSide2 = c
      }

      if(largestSide < c){
        largestSide = c
        smallerSide1 = a
        smallerSide2 = b
      }

      return smallerSide1 + smallerSide2 > largestSide
    }

}

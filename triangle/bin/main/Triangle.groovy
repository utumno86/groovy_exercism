class Triangle {
	static boolean isEquilateral(Number a, Number b, Number c) {
		a == b && b == c && a > 0
	}

	static boolean isIsosceles(Number a, Number b, Number c) {
		(a == b || a == c || b == c) && isTriangle(a, b, c)
	}

	static boolean isScalene(Number a, Number b, Number c) {
		[a, b, c].unique().size() == 3 && isTriangle(a, b, c)
	}

	public static isTriangle(Number a, Number b, Number c) {
		a + b + c >= 2 * [a, b, c].max() && [a, b, c].every { it >= 0 }
	}
}
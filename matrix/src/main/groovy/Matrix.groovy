class Matrix {
    private final int[][] matrix

    Matrix(String asString) {
        matrix = asString.split('\n').collect{ row ->
            row.split(' ').collect{ cell ->
                cell as int
            }
        }
    }

    int[] row(int rowNumber) {
        matrix[rowNumber]
    }

    int[] column(columnNumber) {
        matrix.collect{ row ->
            row[columnNumber]
        }
    }
}

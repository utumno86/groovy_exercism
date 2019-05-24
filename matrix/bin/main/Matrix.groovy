class Matrix {
    private int[][] matrix

    Matrix(String asString) {
        String[] rows = asString.split('\n')
        matrix = new int[rows.length][rows[0].split(' ').length]
        rows.eachWithIndex{ row, i ->
            row.split(' ').eachWithIndex{number, j ->
                matrix[i][j] = Integer.parseInt(number)
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

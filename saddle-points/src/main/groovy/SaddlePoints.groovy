class SaddlePoints {

    static getSaddlePoints(matrix) {
        def saddlePoints = []
        def columns = []
        matrix.eachWithIndex{ row, row_index ->
            row.eachWithIndex{ element, column_index ->
                if (!columns[column_index]){
                    columns[column_index] = []
                }
                columns[column_index] << element
            }
        }
        matrix.eachWithIndex{ row, row_index ->
            row.eachWithIndex{ element, column_index ->
                if (row.max() == element && columns[column_index].min() == element){
                    saddlePoints << [row_index, column_index]
                }
            }
        }

        saddlePoints
    }
}
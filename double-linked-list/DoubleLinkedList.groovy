class DoubleLinkedList<T> {
    def data = []

    void push(T value) {
        data[data.size()] = value
    }

    T pop() {
        def poppedValue = data[data.size() - 1]
        data.removeAt(data.size() - 1)
        return poppedValue
    }

    T shift() {
        def shifedValue = data[0]
        def dataLength = data.size() - 1
        data.eachWithIndex { datum, index ->
            if (index != 0){
                data[index -1] = datum
            }
        }
        data.removeAt(dataLength)
        return shifedValue
    }

    void unshift(T value) {
        def tempArray = []
        data.eachWithIndex { datum, index ->
            tempArray[index + 1] = datum
        }
        data = tempArray
        data[0] = value
    }

}

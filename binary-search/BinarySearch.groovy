class BinarySearch {

    List data

    // You may assume for this exercise that the input data is sorted in ascending order.
    BinarySearch(List data) {
        this.data = data
    }

    int indexOf(item) {
        if (data == []) { return -1 }
        if (!data.contains(item)) { return -1 }
        def index = -2
        int searchIndex = data.size()/2
        while (index == -2){
            println data
            println searchIndex
            switch(data[searchIndex]){
                case { it > item }:
                    println "greater"
                    searchIndex -= (searchIndex/2)
                    break
                case { it < item }:
                    println "lesser"
                    searchIndex += ((data.size() - searchIndex)/2)
                    break
                case { it == item }:
                    println "equals"
                    index = searchIndex
                    break
                default:
                    index = -1
            }

        }
        return index
    }
}

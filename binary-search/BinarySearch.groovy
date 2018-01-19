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
        def previousSearchIndex
        while (index == -2){
            println data
            println searchIndex
            def currentValue = data[searchIndex]
            previousSearchIndex = searchIndex
            if (currentValue < item){
                println "greater"
                println currentValue
                searchIndex += ((data.size() - searchIndex)/2)
                while(searchIndex == previousSearchIndex){
                    searchIndex ++
                }
            } else if (currentValue > item) {
                println "lesser"
                println currentValue
                searchIndex -= (searchIndex/2)
                while(searchIndex == previousSearchIndex){
                    searchIndex --
                }
            } else if(currentValue == item){
                println "equals"
                index = searchIndex
            } else {
                index = -1
            }
        }
        return index
    }
}

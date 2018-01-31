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
        def previousSearchIndexs = []
        while (index == -2){
            def currentValue = data[searchIndex]
            previousSearchIndex = searchIndex
            previousSearchIndexs.push(searchIndex)
            if (currentValue < item){
                searchIndex += ((data.size() - searchIndex)/2)
                while(previousSearchIndexs.contains(searchIndex)){
                    searchIndex ++
                }
            } else if (currentValue > item) {
                searchIndex = (searchIndex/2)
                previousSearchIndex = searchIndex
                previousSearchIndexs.push(searchIndex)
                while(previousSearchIndexs.contains(searchIndex) && searchIndex >= 0){
                    searchIndex --
                }
                while (searchIndex < 0 || previousSearchIndexs.contains(searchIndex)){
                    searchIndex ++
                }
            } else if(currentValue == item){
                index = searchIndex
            } else {
                index = -1
            }
        }
        return index
    }
}

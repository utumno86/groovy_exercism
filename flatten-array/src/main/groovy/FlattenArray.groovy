class FlattenArray {
  static List flatten(ary) {
    def flattened = []
    ary.each{ element ->
       if (element instanceof List) {
         flatten(element).each{ nested_element ->
          flattened.add(nested_element)
         }
       } else if (element != null) {
         flattened.add(element)
       }
    }
    flattened
  }
}
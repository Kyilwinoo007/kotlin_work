fun main(args:Array<String>){
  val items = listOf("apple","banna","pineapple","grapefruit") //list using listOf method
  for (item in items){
    println(item)
  }
  for (i in items.indices) {
    println(i)

  }
  // index using array.indices
  for (index in items.indices ) {
    println("Item at $index is ${items[index]}")

  }
  for (i in 1..4) {
      println(i)
  }
  for (i in 7 downTo 0 step 2){
    println(i)
  }

}

fun  main(args: Array<String>) {
    var b: String = "abc"
    var a:String? = null  // you can add null using dataType +? like this Int? 
    println(b?.length)  //unnecessary safe call on a non-null receiver of type String
    println(a?.length)  // this is safe call 
    println()
    println("Null safety in list using let")
    println()
    val listWithNull :List<String?> = listOf("Kotlin",null,"hello","kk")
    for (items in listWithNull) {
        items?.let{println(items)}  // check with let and if value is null not print!! that is 
        
    }

    //Elvis Operator ?:
    val l:Int = if (b!=null)b.length else -1
    val l1 = a?.length ?:-1
    println(l)
    println(l1)

    // you can also use Evis operator like this
    // fun foo(node: Node): String? {
    // val parent = node.getParent() ?: return null
    // val name = node.getName() ?: throw IllegalArgumentException("name expected")
    // ...
    //}

    //The !! Operator 
    val l2 = b!!.length
    // val l3 = a!!.length
    println(l2)
    // println(l3)

    //Safe Casts
    // Regular cast may result to ClassCastException if the object is not of the targe type
    //another options is safe cast that return null attempt is not successful
    val aInt :Int? = a as? Int 
    println(aInt) // will return null 

    //Collection of nullable type 
    //If you have a collections of nullable type and want to filter non-null elements.
    // good news kotlin have filterNotNull
    val nullableList : List<Int?> = listOf(1,2,3,null, 4,5,null,10)
    // before filterNotNull
    for (items in nullableList) {
        print(items)
        
    }
    println()
    //after filterNotNull
    val non_nullableList :List<Int> = nullableList.filterNotNull()
    for (items in non_nullableList) {
        print(items)
        
    }

}
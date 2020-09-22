fun main(){
	println("Implicit conversion is not support in kotlin,smaller data type to larger data type")
	println("Long = Int compile error , type mismatch")
	println("But Explicit conversion is support using helper function")
	val value = 10
	println("My Int value $value")
	val long_value :Long = value.toLong()
	println("After conversion Int ot Long using helper function $long_value")

	 var value1: Long = 200
    val value2: Int =value1.toInt()
    println(value2)
	}

fun main()
{
	println("Array create using arrayOf.........")
	val array_id = arrayOf(1,2,3,4,5,6)
	val array_string = arrayOf("hello","world","kotlin")
	val firstId = array_id[0]
	val lastId = array_id[array_id.size-1]
	println("first id in array is $firstId")
	println("last id in array is $lastId")
	for(id in array_id){
		println(id)
	}
	println(array_string[0])

	println("Array create using Array()")
	val lstId = Array(6,{i -> i*3})
	for(id in lstId){
		println(id)

	}
}

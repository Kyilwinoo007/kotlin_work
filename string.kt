fun main(){
val str = "This is string in kotlin "
var str1 = "This is string too \n"
print(str)
print(str1)
println("Raw string in kotlin")
val raw_str = """
			Welcome
			To
			Kotlin"""
	print(raw_str)
println("String concatentate using +")
val strConcat = "abc"+1

println(strConcat + "defghijklmnop")
println("Using trimMargin() remove leading white space")
val text = """Tell me what it is ko nyein maung.
				|Please Ko Nyein Maung ,let it fun the youngs.
				|No way ma khin ma ma.""".trimMargin()  // default is | or either you can you > / or something like that trimMargin(">")
				println(text)

}

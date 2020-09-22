fun main(){
  // read only variavble  are defined usin val keyword
  val a: Int = 1 // immediate assignment
  val b = 2 // Int type is inferred
  val c: Int // variavble type required when no initializer is provided
  c = 3
  println("$a,$b,$c")
  // in kotlin  read only variavbles must use after declaration

  // Double declaration
  var variable_double : Double = 1.32435
  var variabe_float = 2.12f
  println(variable_double)
  println(variabe_float)

// char declaration
val value1= 'A'
println(value1)

val value2:Char
value2 = 'B'
println(value2)

// variavble that can be reassigned use var keyword
var x = 5
println("first declaration of x is $x")
x +=1
println("now add 1 to x and $x")
// String template
var num=1
// string name in template
val str = "number is $num"
num = 3
println(str)

val str2= "${str.replace("is","was")},but now is $num"
println(str2)

// underscore in numeric literal
val one_million=1_000_000
val credit_card_number=1021_2345_3456
val two_million = one_million * 2

println(one_million)
println(credit_card_number)
println(two_million)

// val number = 1000
// println(number === number)
// val num1 : Int? = number
// val another_num : Int? = number
// println(num1 === another_num)
//

}

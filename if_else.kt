fun main(args:Array<String>){
val num1 = 10
val num2 = 20
val result = if (num1 > num2) {
  "$num1 is greater than $num2"
}else {
  "$num2 is greater than $num1"
}
println(result)
println("max of $num1 and $num2 is ${maxOf(num1,num2)}")
}
fun maxOf(a:Int , b:Int)=if(a>b) a else b

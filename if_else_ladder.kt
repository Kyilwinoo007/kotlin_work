fun main (args:Array<String>){
val num = 20
val result = if(num>0){
  "$num is positive"
}else if (num<0) {
  "$num is negative"
}else {
  "$num is zero"
}
println(result)
}

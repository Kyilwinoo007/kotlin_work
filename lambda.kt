fun main(args:Array<String>){
val myLambda:(Int) -> Unit = {s:Int -> println(s)}  //Unit return type is returning no meaningful value
addNumber(3,5,myLambda)
}
fun addNumber(a: Int,b: Int,myLambda: (Int)-> Unit){
  val add = a + b
  myLambda(add)

}
// fun main(args: Array<String>){
//     val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function
//     addNumber(5,10,myLambda)
// }
// fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
//     val add = a + b
//     mylambda(add) // println(add)
// }

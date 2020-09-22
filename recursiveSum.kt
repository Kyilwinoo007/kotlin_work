fun main(args:Array<String>){
  println("Enter number you want to sum recursive")
var number = Integer.valueOf(readLine())
var result: Int
result = recursiveSum(number)
println(result)
}
fun recursiveSum(n:Int):Int{
  return if (n<=1) {
    n
  }
  else {
    n + recursiveSum(n -1)
  }

}

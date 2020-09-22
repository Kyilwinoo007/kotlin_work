fun main(args:Array<String>){
  println("Enter a number you want to calculate factorial")
  val number =Integer.valueOf(readLine())
  val result:Long
  result = factorial(number)
  println("Factorial of $number = $result")
}
fun factorial(n: Int):Long{
  return if(n==1){
    n.toLong()
  }
  else{
    n * factorial(n-1)
  }
}

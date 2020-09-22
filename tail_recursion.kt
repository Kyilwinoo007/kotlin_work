fun main(args:Array<String>){
println("Enter a number")
var number = Integer.valueOf(readLine())
val result: Long
result = factorial(number)
println("Factorial of $number = $result")
}
tailrec fun factorial(n:Int ,run:Int =1):Long{
  return if (n==1) {
    run.toLong()
  }
  else {
    factorial(n-1,run * n)
  }
}

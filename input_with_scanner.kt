import java.util.Scanner
fun main(args:Array<String>){
val read = Scanner(System.in); // get error I don't know why
println("Enter your age --")
var age = read.nextInt()
read.nextDouble()
read.nextFloat()
read.nextBoolean()
read.nextLong()
println("Your age is $age")
}

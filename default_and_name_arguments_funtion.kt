fun main(args:Array<String>){
println("call run() without arguments")
run()
println()
println("call run(50)")
run(50)
println()
println("call run('a')")
// run('a')
println(" error: the character literal does not conform to the expected type Int")
println()

println("call run(letter = 'a')")
run(letter = 'a')
println()
println("call run(23,'d')")
run(23,'d')
println()
}
fun run (num: Int = 10,letter: Char = 'x'){
  println("Number is $num and letter is $letter")
}

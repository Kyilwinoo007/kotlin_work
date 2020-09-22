fun main(args:Array<String>){

for(i in 1..8) {
  if (i==4) {
      break
  }
  println(i)

}
println("--------- break with label -------")
loop@ for (i in 1..7) {
  for(j in 1..5){
    println("i = $i and j = $j")
    if (i == 3)
    break@loop
  }

}
}

fun main(args:Array<String>){
  for (i in 1..5) {
    println("i = $i")
    if (i ==3) {
      continue
    }
    println("This is below of if $i")

  }
  println()
  println()
  println("----continue with label----")
  continueLabel@ for(i in 1..4){
    for(j in 1..3){
      println("i = $i and j = $j")
      println()
      if (i ==2) {
          println("Jump--->")
          continue@continueLabel
      }
      println("This is below of if")
    }
  }
}

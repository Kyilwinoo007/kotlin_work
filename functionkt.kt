  fun main(){
    println(sum(2,3))// function call
    println(sub(7,2))
    printsum(45 , 23)
    printSub(30,12)
  println("Power of number ${powerof(3,3)}")
  defaultValueTest()
  }
  // function add two int number and return int number
  fun sum(a: Int,b: Int): Int{
    return a + b
  }
  // function with an expression body inferred return type
  fun sub(a: Int,b: Int) = a-b
  //function returning no meanful value:
  fun printsum(a: Int,b: Int): Unit{
    println("Sum of $a and $b  is ${a+b}")
  }
  // ommiting return type:
  fun printSub(a: Int,b: Int){
    println("Substraction of $a and $b is ${a-b}")
  }
  fun powerof(number:Int,exponent: Int): Int{
    var result = 1
    for (x in 1..exponent ) {
      result *= number
    }
    return result
  }
  // default arguments in function
  // fun read(a:Array<Byte>,off: Int=0,len:Int=b.size){
  // }



  fun defaultValueTest(a: Int=10,b: Int=20){
    println("Sum of default parementers $a and $b ${a+b}")
  }

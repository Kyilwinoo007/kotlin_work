fun main(args:Array<String>){
  println("Enter month number")
  var number = Integer.valueOf(readLine())
  when(number){
    3,4,5,6 ->println("It is Summer season")
    7,8,9,10 ->println("It is Rainy season")
    11,12,1,2 ->println("It is Winter Season")
    else ->println("Invalid Input")
  }

  println("-------using when with range--------")
  println("Enter a number you want")
  when(Integer.valueOf(readLine())) {
    in 1..10 ->println("Your number is in between 1 to 10")
    in 10..20 ->println("Your number is in 10 to 20")
    else ->println("none of the above")

  }
}

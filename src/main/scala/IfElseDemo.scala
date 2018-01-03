package main.scala

object IfElseDemo extends App {
  //classical approach
  val a =1
  var b:String =""
  if (a==1)
    b="one"
  else
    b="something else"
  println(b)

  //functional approach
  b = if (a==1) {
    "one"
  } else {
    "something else"
  }
  println(b)

  //more functional approach
  val bVal = if (a==1) {
    "one"
  } else {
    "something else"
  }
  println(bVal)

  //even more functional approach
  val bF = if (a==1) {
    () => "one"
  } else {
    () => "something else"
  }
  println(bF())
}

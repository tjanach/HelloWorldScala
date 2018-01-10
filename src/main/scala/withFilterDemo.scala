package main.scala

object withFilterDemo extends App{

  val intList = List(1,2,3,4,5)

  println(intList.filter(_ >3))
  //more effective, as withFilter does not copy the list
  println(intList.withFilter(_ >3).map(x => x*x))

}

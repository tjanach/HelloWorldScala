package main.scala

object ParallelFilterDemo extends App{

  val intList = (1 to 100000).toList
  val startTimeA = System.nanoTime()
  val sevenList = intList.filter(_ % 7 ==0 )
  val endTimeA = System.nanoTime()
  println("Filtered list size: "+sevenList.length)
  println(endTimeA-startTimeA)

  val startTimeB = System.nanoTime()
  val sevenListB = intList.par.filter(_ % 7 ==0 )
  val endTimeB = System.nanoTime()
  println("Filtered list size: "+sevenListB.length)
  println(endTimeB-startTimeB)


}

package main.scala

object ParallelReduceDemo extends App{

  val intList = (1 to 100000).toList
  val startTimeA = System.nanoTime()
  val sumA = intList.reduce(_-_)
  val endTimeA = System.nanoTime()
  println(sumA)
  println("Duration: "+(endTimeA-startTimeA))

  val startTimeB = System.nanoTime()
  val sumB = intList.par.reduce(_-_) //for minus - operator, there is no guarantee that the order is right, diff result
  val endTimeB = System.nanoTime()
  println(sumB)
  println("Duration: "+(endTimeB-startTimeB))


}

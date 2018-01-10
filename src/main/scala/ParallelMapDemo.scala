package main.scala

object ParallelMapDemo extends App{

  val intList = (1 to 1000000).toList
  val startTimeA = System.nanoTime()
  val stringList = intList.map(_.toString)
  val endTimeA = System.nanoTime()
  println(endTimeA-startTimeA)

  val startTimeB = System.nanoTime()
  val stringListComputedParallely = intList.par.map(_.toString)
  val endTimeB = System.nanoTime()
  println(endTimeB-startTimeB)
}

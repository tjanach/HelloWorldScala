package main.scala

object MapDemo extends App{

  val numStrings = List("1", "2", "3", "4", "5")
  val numInts = numStrings.map(_.toInt)

  println(numInts)
  println("----------------")
  numInts.map(println)
  println("----------------")
  numInts.map(x => x*x).map(println)
}

package main.scala

object FlatMapDemo extends App {

  val numStrings = List(List("1"), List("2", "3"), List("4"), List("5"))

  val numInts = numStrings.flatMap(x => x.map(_.toInt))
  val slowInts = numStrings.flatten.map(_.toInt)

  println(numInts)
  println(slowInts)
  println("--------------------")
  numInts.map(println)
  println("--------------------")
  numStrings.flatMap(x => x.map(y => y.toInt * y.toInt)).map(println)

}

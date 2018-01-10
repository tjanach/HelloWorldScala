package main.scala

object reduceDemo extends App{

  val numList = List(1,2,3,4,5)
  val f = numList.reduce(_*_)

  println(f)

  val letterList = List("a", "b", "c", "d")

  val cfLeft = letterList.reduceLeft("("+_+_+")")
  val cfRight = letterList.reduceRight("("+_+_+")")
  val cf = letterList.reduce("("+_+_+")")

  println(cfLeft)
  println(cfRight)
  println(cf)


}

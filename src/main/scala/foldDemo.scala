package main.scala

object foldDemo extends App{
  val numList = List(1,2,3,4,5)

  val fLeft = numList.foldLeft(0)(_+_)
  val f = numList.fold(0)(_+_)
  val f6 = numList.fold(6)(_+_)

  println(fLeft)
  println(f)
  println(f6)
  println("------------------------")

  val letterList = List("a", "b", "c", "d")

  val cfLeft = letterList.foldLeft("left: ")("("+_+_+")")
  val cfRight = letterList.foldRight(" :right")("("+_+_+")")
  val cf = letterList.fold("res: ")("("+_+_+")")

  println(cfLeft)
  println(cfRight)
  println(cf)


}

package main.scala

object TypedPatternDemo extends App{

  def fn(a :Any):String = a match {
    case _: Char => "Char"
    case _: Int | _: Long | _: Short => "Integer"
    case _: Double | _: Float => "Floating point"
    case _: String => "String"
    case _ => "N/A"
  }

  println(fn(1))
  println(fn(1L))
  println(fn(1:Short))
  println(fn('a'))
  println(fn("text"))
  println(fn(true))
  println(fn(1.1d))
  println(fn(1.1f))

}

package main.scala

object CaseClassesDemo extends App {

  abstract class DelimitedLine
  case class TabDelimited() extends DelimitedLine
  case class CommaDelimited() extends DelimitedLine
  case class SpaceDelimited() extends DelimitedLine

  def delimiter(d: DelimitedLine):String = d match {
    case TabDelimited() => "\t"
    case CommaDelimited() => ","
    case SpaceDelimited() => " "
  }

  val t:DelimitedLine = new TabDelimited
  val s = SpaceDelimited()
  val c = CommaDelimited()

  println(t.toString)
  println(s.toString)
  println(c.toString)

  println("delimiter***"+delimiter(t)+"***")
  println("delimiter***"+delimiter(s)+"***")
  println("delimiter***"+delimiter(c)+"***")

  println(t==s)
  println(t==c)
}

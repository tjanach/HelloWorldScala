object CaseFunctionsDemo extends App {
  val list = List("Bob","Johan", "Marc", "Steve")

  var str :String = ""
  list.foreach(str += _ +" ")
  println(str)

  def listToStr(list :List[String]) :String = list match {
    case a :: tail => a +" "+ listToStr(tail)
    case Nil =>""
  }
  println(listToStr(list))
}

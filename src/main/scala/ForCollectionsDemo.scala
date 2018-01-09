package main.scala

object ForCollectionsDemo extends App{

  val intSet: Set[Int] = Set(5,3,1,6,56,9,0)
  val strList: List[String] = List("Ala ma kota", "Bela ma psa")

  //non-zero elements
  val a = for {
    r <- intSet
    if (r!=0)
  } yield r
  println(a)

  //to upper case
  val b = for {
    s <- strList
  } yield s.toUpperCase
  println(b)

  val c = strList.map(_.toUpperCase)
  println(c)

}

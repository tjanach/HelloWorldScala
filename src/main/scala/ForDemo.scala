package main.scala

object ForDemo extends App{

  case class BirthYear(name:String, year:Int)

  val births: List[BirthYear] = List(
    BirthYear("Steve", 1978),
    BirthYear("Ala", 1938),
    BirthYear("Woj", 1966),
    BirthYear("Jorge", 2011)
  )

  val a = for(r <- births; n =r.year; if (n==1978)) yield r
  println(a)
  val b = for{
    r <- births
    n =r.year
    if (n<=1978)
  } yield r
  println(b)

}

package main.scala

object ForWithDemo extends App{

  case class StreetAddress(name:String, street:String)

  val addresses: List[StreetAddress] = List(
    StreetAddress("Steve", "PO Box 1144"),
    StreetAddress("Ala", "123 22nd Street"),
    StreetAddress("Woj", "PO Box 981"),
    StreetAddress("Jorge", "112 8th Avenue")
  )

  val a = for{
    r <- addresses
    n =r.street
    if (n startsWith "PO Box")
  } yield r
  println(a)

  val b = for{
    r <- addresses
    n =r.street
    if ((n indexOf "8th") >= 0)
  } yield r
  println(b)

  val c = for{
    r <- addresses
    n =r.street
    if (n endsWith "Street")
  } yield r
  println(c)

}

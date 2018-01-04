package main.scala.interoperability

@deprecated
@SerialVersionUID(1L)
class HeadphoneJack(var size:Double) extends Serializable{
  @inline def jackSize():String ={
    "Headphone Jack Size is: " + size;
  }
}

object AnnotationsDemo extends App{
  val jack = new HeadphoneJack(3.5)
  println(jack.jackSize())

}

package main.scala.interoperability

class ThrowExceptionClass {

  @throws(classOf[Exception])
  def doThrow {
    throw new Exception("Catch it!")
  }

}

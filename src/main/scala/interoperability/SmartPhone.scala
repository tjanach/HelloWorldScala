package main.scala.interoperability

trait CameraT{
  def setMode(m :String): String
  def setFStop(f :Float): String
  def setShutterSpeed(s :Float): String

  def takePhoto():String = "(picture data)"
}

trait X
trait Y


class SmartPhone extends CameraT with X with Y{
  def setMode(m: String):String = {
    if (m!="Manual") {
      "N/A"
    }
    m
  }
  def setFStop(f :Float): String = {
    if (f<1.8){
      "Invalid f-stop setting"
    }
    "OK"
  }

  def setShutterSpeed(s :Float): String ={
    "OK"
  }
}


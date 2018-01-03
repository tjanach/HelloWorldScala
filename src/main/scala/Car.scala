package main.scala

class Car(milesPerGalon:Int, gallonsPerTank:Int) {
  var mpg: Int = milesPerGalon
  var gpt: Int = gallonsPerTank
  var mpt: Int = 0

  def milesPerTank(): Unit ={
    mpt = mpg * gpt
    println("Number of Miles Per Tank:" +mpt)
  }
}

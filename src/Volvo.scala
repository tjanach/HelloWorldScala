class Car(milesPerGalon:Int, gallonsPerTank:Int) {
  var mpg: Int = milesPerGalon
  var gpt: Int = gallonsPerTank
  var mpt: Int = 0

  def milesPerTank(): Unit ={
    mpt = mpg * gpt
    println("Number of Miles Per Tank:" +mpt)
  }
}

object Volvo {
  def main(args: Array[String]) = {
    val volvo = new Car(40, 18)
    volvo.milesPerTank()
  }
}

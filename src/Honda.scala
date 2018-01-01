class Vehicle(vehicleName: String){
  var name: String = vehicleName
  var avgSpeed: Int = 0

  def calcAvgSpeed(distance: Int, time: Int){
    avgSpeed = distance/time
    println("The "+ name +" had an average speed of "+avgSpeed+" mph.")
  }
}

object Honda {
  def main(args: Array[String]){
    var honda = new Vehicle("Honda CRV")
    honda calcAvgSpeed (200,2)
  }

}

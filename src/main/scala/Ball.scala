package main.scala

class Ball(diameter: Double) {
  var d: Double = diameter
  var c: Double = 0

  def calcCircumference() {
    c = Math.PI *d
    println("Circumference of ball: "+ c +"cm")
  }

}

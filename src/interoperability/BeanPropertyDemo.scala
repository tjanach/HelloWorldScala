package interoperability

object BeanPropertyDemo extends App {
  val c = new Camera("Nikon", "D3")

  println(c.getMake)
  println(c.getModel)

  c.setMake("Cannon")
  c.setModel("5D")

  println(c.getMake)
  println(c.getModel)

  c.make = "Kiev"
  c.model = "K2"

  println(c.make)
  println(c.model)
}

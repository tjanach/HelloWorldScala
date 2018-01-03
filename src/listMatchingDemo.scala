object listMatchingDemo extends App{

  def sumInts(list: List[Int]):Int = list match {
    case a :: tail => a + sumInts(tail)
    case Nil => 0
  }

  val intList: List[Int] = List(10, -5, -5, 10, -1, 1, 100)
  println(sumInts(intList))

}

package main.scala

object lazyDemo {
  def main(args: Array[String]): Unit ={
    lazy val t = {
      println("Hello, t")
      List("AK", "AB", "AC")
    }

    val s = {
      println("Hello, s")
      List("SK", "SB", "SC")
    }

    println(t)
    println(s)

    //example 2
    def memoizeListFromDB():List[String] = {
      println("Load list from DB")
      Thread.sleep(2000)
      List("DF", "DR", "DE")
    }

    lazy val v = memoizeListFromDB()
    println("Access list from DB")
    println(v)
  }

}

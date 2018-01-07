package main.scala

object streamsDemo {
  def main(args :Array[String]): Unit ={
    val intStream = 0 #:: 1 #:: 2 #:: 3 #:: 4 #:: 5 #:: Stream.Empty
    println(intStream)
    println(intStream.toList)
    println(intStream.max)

    val intList = 0 :: 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    println(intList)
    println(intList.toStream)

    def doFib(a: Int, b:Int): Stream[Int] = a #:: doFib(b,a+b)
    val fibStream = doFib(1,1).take(15)
    println(fibStream.toList)
    val fibStream2 = doFib(1,1).take(20)
    println(fibStream2.toList)

    def doAnotherStream(a: Long, b:Long): Stream[Long] = a #:: doAnotherStream(b,a*b)
    val anotherStream = doAnotherStream(1,2).take(15)
    println(anotherStream.toList)

    def doAStream(a: Long, b:Long): Stream[Long] = a #:: doAStream(a*b,b)
    val aStream = doAStream(1,4).take(15)
    println(aStream.toList)

    def doRandomStream(l: Double, r:Double): Stream[Double] = (l+math.random()*(r-l)) #:: doRandomStream(l,r)
    val rStream = doRandomStream(1,2.6).take(15)
    println(rStream.toList)

    // Random generator
    val random = new scala.util.Random

    // Generate a random string of length n from the given alphabet
    def randomString(alphabet: String)(n: Int): String =
      Stream.continually(random.nextInt(alphabet.size)).map(alphabet).take(n).mkString




    // Generate a random alphabnumeric string of length n
    def randomAlphanumericString(n: Int) =
      randomString("abcdefghijklmnopqrstuvwxyz0123456789")(n)

    def randomDigitString(n: Int) =
      randomString("0123456789")(n)

    println(randomAlphanumericString(3))

    def doRandomStringStream(n :Int): Stream[String] = randomAlphanumericString(n) #:: doRandomStringStream(n)
    val rsStream = doRandomStringStream(8).take(15)
    println(rsStream.toList)

    val str = Stream.continually(random.nextInt(10))
    println(str.take(20).toList)
    val  strS = str.map("abcdefghij").take(10).mkString
    println(strS)

    val strA = Stream.continually("a")
    println(strA.take(20).toList)

    val strB = Stream.continually(randomDigitString(5).toInt)
    println(strB.take(20).toList)
  }
}

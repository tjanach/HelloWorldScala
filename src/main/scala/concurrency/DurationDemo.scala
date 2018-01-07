package main.scala.concurrency
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future,Await}
import scala.concurrent.duration._

object DurationDemo extends App{
  val m1 = System.currentTimeMillis() milliseconds
  val fVal = Future{
    "Hello, from the Future"
  }
  val res = Await.result(fVal, 1500 milliseconds)
  println(res)

  val m2 = System.currentTimeMillis() milliseconds

  println(m2-m1)
  val someDuration = Duration(1, "second")
  println(someDuration > (m2-m1))
}

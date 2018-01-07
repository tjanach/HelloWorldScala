package main.scala.concurrency

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future,Await}
import scala.concurrent.duration._
import java.util.concurrent.TimeoutException

object ScalaBlockingDemo extends App{

  val fVal = Future {
    Thread.sleep(2000)
    "Hello, from the Future"
  }

  try {
    val result: String = Await.result(fVal, 3 seconds)
    println(result)
  } catch {
    case e: TimeoutException =>
      println("The future did not complete on time")
  }

}

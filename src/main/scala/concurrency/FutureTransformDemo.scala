package main.scala.concurrency

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureTransformDemo extends App{
  val fVal = Future {
    "Hello, from the Future"
  }

  /*val checked = fVal.filter(res => !res.isEmpty)
  Thread.sleep(1000)
  println(checked)*/

  val validated = fVal.collect {
    case r if r.isEmpty => "empty"
    case s => s
  }
  Thread.sleep(1000)
  println(validated)
}

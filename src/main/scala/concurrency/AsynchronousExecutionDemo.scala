package main.scala.concurrency
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object AsynchronousExecutionDemo extends App{
  val fVal = Future {
    Thread.sleep(2000)
    "Hello, from the Future"
  }

  println(fVal.isCompleted)
  println(fVal.value)
  Thread.sleep(2500)
  println(fVal.isCompleted)
  println(fVal.value)

  val fVal1 = Future {
    Thread.sleep(2000)
    1/0
  }

  println(fVal1.isCompleted)
  println(fVal1.value)
  Thread.sleep(2500)
  println(fVal1.isCompleted)
  println(fVal1.value)

  val fValB = Future {
    Thread.sleep(2000)
//    "OK"
    1/0
  }

  val result1 = for {
    iVal <- fVal
    iValB <- fValB
  } yield iVal + iValB

  Thread.sleep(2500)
  println(result1.isCompleted)
  println(result1.value)
}

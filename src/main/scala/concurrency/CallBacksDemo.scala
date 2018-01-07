package main.scala.concurrency
import scala.util.{Failure, Success}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object CallBacksDemo extends App{

  val fVal = Future {
    "Hello, from the Future"
    throw new Exception("There is no future")
  }

  fVal onComplete {
    case Success(s) => {
      println(s)
    }
    case Failure(e) => {
      println("Error: "+e.getMessage)
    }
  }

  if (fVal.isCompleted == false) Thread.sleep(1000)
}

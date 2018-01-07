package main.scala.concurrency
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future,Await,Promise}
import scala.concurrent.duration._

object PromiseDemo extends App{

  val p = Promise[String]()

  Future {
    val s = "Hello, Promise"
    if (!s.isEmpty)
      p success s
    p failure (new Exception("Empty String"))
  }

  val res = Await.result(p.future, 2 seconds )
  println(res)
}

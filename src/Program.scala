object Program {
  def main(args: Array[String]) :Unit = {
    //scala closure example
    val b :Int = 8
    val doIt = (a:Int) => a + b
    println(doIt(10))

    //partially applied function
    val mulIt = (a:Int, b:Int) => a * b
    println(mulIt(10,5))
    println(b)
    val timesTen = mulIt(10,_:Int)
    println(timesTen(3))

    //curring functions
    def mulItCurrying(a:Int) = (b:Int) => a * b
    println(mulItCurrying(3)(4))

    //function composition
    val subTotal = (amt:Int) => {
      val cost:Double =   .5
      cost * amt
    }
    val withTax = (sub:Double) =>{
      val tax = 1.1
      sub*tax
    }
    val total = (withTax compose subTotal)(12)
    println(total)
    val totalA = (subTotal andThen withTax)(12)
    println(totalA)

    //recursion and tail call optimization
    def recurse(counter:Int):Int ={
      if(counter==1)
        return 1
      counter*recurse(counter-1)
    }
    println(recurse(5))
    def recurseTail(total:Int, counter:Int):Int ={
      if(counter==1)
        return total
      recurseTail(total*counter,counter-1)
    }
    println(recurseTail(1,10))

    //call by name vs call by value
    def showTime() ={
      System.nanoTime()
    }
    def printTime(time:Long) = {
      println("Time: ")
      println(time)
      println("time now: ")
      time
    }
    println(printTime(showTime()))

    def printTimeA(time: => Long) = {
      println("Time: ")
      println(time)
      println("time now: ")
      time
    }
    println(printTimeA(showTime()))
  }

}

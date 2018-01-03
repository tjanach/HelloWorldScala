object CollectionsAndStrings {
  def main(args: Array[String]) :Unit = {
    val y = List(1,2,3)
    println(y)
    val x = List("a","b","c")
    println(x)
    println(x.head)
    println(x.tail)

    //mutable and immutable collections
    val fruits = Seq("apple", "orange","banana")
    println(fruits)
    //mutable
    import scala.collection.mutable.ListBuffer
    val fruitsLB = ListBuffer("apple", "orange","banana")
    println(fruitsLB)
    fruitsLB += "cherries"
    println(fruitsLB)
    fruitsLB -= "orange"
    println(fruitsLB)
    fruitsLB -= "pear"
    println(fruitsLB)

    //set
    val words = Set("the", "fix", "that", "bug", "the")
    println(words)
    println(words.head)
    println(words.tail)
    println(words.isEmpty)
    println(words)
    //sets concatenation
    val words1 = Set("the", "fix", "that", "bug", "the")
    val words2 = Set("the", "more", "the", "better")
    val sentence = words1.++(words2)
    println(sentence)
    //min max over set elements
    import scala.collection.mutable.Set
    val nums = Set(1,2,3,4,5,6,7,8,9,10)
    println(nums.min)
    println(nums.max)
    //maps
    val fruitMap = Map("apples" -> "$0.7", "oranges" -> "$1.5", "bananas" -> "$0.85")
    println(fruitMap)
    println(fruitMap.keys)
    println(fruitMap.values)
    println(fruitMap("oranges"))
    fruitMap.keys.foreach { i =>
      print("Key: " + i)
      println(" Value: " + fruitMap(i))
    }
    //sequence sorting
    val numbers = Seq(1,25,18,3,7,29,14,3)
    println(numbers)
    val sorted = numbers.sorted
    println(sorted)

    val fruitsSorted = fruits.sorted
    println(fruitsSorted)

    //iterators
    val wordsIt = Iterator("the", "quick","brown","fox", "jumped", "over", "the", "lazy", "dog")
    while(wordsIt.hasNext){
      print(wordsIt.next()+" ")
    }
    //println(wordsIt)
  }

}

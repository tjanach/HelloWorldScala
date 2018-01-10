package main.scala

object ParallelSortDemo extends App {

  val listToSort = List(5,3,1,4,2)
  println(listToSort)

  val arrayToSort = listToSort.toArray
  java.util.Arrays.parallelSort(arrayToSort)
  println(arrayToSort)
  println(arrayToSort.toList)
}

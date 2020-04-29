package homework

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object Work6 {
  def main1(args: Array[String]): Unit = {
    val array: Array[Int] = makeArr(6)

    for (i <- array) {
      println(i)
    }
  }

  //使用for推导式中的yield返回Vector集合
  def makeArr(num: Int): Array[Int] = {
    val array = new Array[Int](num)
    for (i <- array) yield new Random().nextInt(10)
  }

  def main2(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6)
    reverse(arr)
    println(arr.mkString(","))
  }

  //for推导式，遍历时加上step为2
  def reverse(arr: Array[Int]) = {
    for (i <- 0 until(arr.length - 1, 2)) {
      val temp = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = temp
    }
  }


  //Array(1,2,9,3,-1,3,0,0,4)=>Array(1,2,9,3,3,0,0,-1,-4)
  def mai11n(args: Array[String]): Unit = {
    val arr = Array(1, 2, 9, 3, -1, 3, 0, 0, -4)
    val array: Array[Int] = sortArray(arr)
    println(array.mkString(","))
  }

  //按照过滤条件进行for推导式
  def sortArray(arr: Array[Int]) = {
    val arrayBuffer = new ArrayBuffer[Int]()
    arrayBuffer ++= (for (i <- arr if i > 0) yield i)
    arrayBuffer ++= (for (i <- arr if i == 0) yield i)
    arrayBuffer ++= (for (i <- arr if i < 0) yield i)
    arrayBuffer.toArray
  }
}

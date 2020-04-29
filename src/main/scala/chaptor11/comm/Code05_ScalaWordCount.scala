package chaptor11.comm

import scala.collection.mutable

//Scala版本的WorldCount
object Code05_ScalaWordCount {

  //1.使用不可变map实现
  def main1(args: Array[String]): Unit = {

    val str = "AAAAABBBBBCCCDDDD"
    var map1 = Map[Char, Int]()
    val map2: Map[Char, Int] = str.foldLeft(map1)(charCount)
    println(map2)
  }

  //Map[Char, Int]是左折叠时传入的参数，左后的返回值也是它
  def charCount(map: Map[Char, Int], c: Char): Map[Char, Int] = {
    map + (c -> (map.getOrElse(c, 0) + 1))
  }

  //2.使用可变map实现
  def main(args: Array[String]): Unit = {

    val str = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val map = mutable.Map[Char, Int]()
    str.foldLeft(map)(myFlatMap) //Map()
    println(map)
  }

  def myFlatMap(map: mutable.Map[Char, Int], c: Char): mutable.Map[Char, Int] = {

    //+ 后将新生成的map返回
    map += (c -> (map.getOrElse(c, 0) + 1))
  }
}

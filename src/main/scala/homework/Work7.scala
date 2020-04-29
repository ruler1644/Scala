package homework

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Work7 {
  def main1(args: Array[String]): Unit = {

    //价格打九折
    val map = Map("Book" -> 10, "ipad" -> 50)
    val stringToDouble: Map[String, Double] = for ((k, v) <- map) yield (k, v * 0.9)
    println(stringToDouble)

    //找出数组的最小值和最大值
    val array = Array(1, 5, 0, -3, 6)
    println(getTuple(array))

    //过滤数组中的零值
    val list = List(1, 5, 0, -3, 6)
    val res: List[Int] = removeZero(list)
    println(res)
  }

  def getTuple(array: Array[Int]) = {
    (array.min, array.max)
  }

  def removeZero(list: List[Int]) = {

    list.filter(_ != 0)
    //list.filter((num: Int) => num != 0)
  }


  def main2(args: Array[String]): Unit = {

    //Array("Tom","Fred","Harry")  Map("Tom"->3,"Dick"->4,"Harry"->5)
    //返回Array(3,5)
    //用flatMap将get返回的Option值组合在一起
    val array = Array("Tom", "Fred", "Harry")
    val map = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
    //    val array2 = ArrayBuffer[Int]()
    //
    //    for (item <- array) {
    //      if (map.contains(item)) {
    //        array2.append(map.get(item).get)
    //      }
    //    }
    //    println(array2.mkString(","))

    val array2: Array[Int] = strMap(array, map)
    println(array2.mkString(","))
  }

  def strMap(strArr: Array[String], map: Map[String, Int]): Array[Int] = {
    strArr.flatMap(map.get(_))
    //strArr.flatMap((arrKey: String) => map.get(arrKey))
  }

  //手动实现mkString(使用reduceLeft)
  def main(args: Array[String]): Unit = {

    val set = mutable.HashSet("a", "b", "c")
    println(myMakeString(set))
  }

  //取出set中的元素，返回一个字符串
  def myMakeString(set: Iterable[String]): String = {

    //    if (set != Nil) {
    //      set.reduceLeft((str: String, str2: String) => {
    //        (str + "," + str2)
    //      })
    //    } else {
    //      ""
    //    }

    if (set != Nil)
      set.reduce(_ + "," + _)
    else
      ""

  }
}

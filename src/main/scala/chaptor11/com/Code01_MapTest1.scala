package chaptor11.com

import scala.collection.mutable.ListBuffer

//请将List(3,5,7) 中的所有元素都 * 2 ，将其结果放到一个新的集合中返回，
// 即返回一个新的List(6,10,14)
object Code01_MapTest1 {
  def main(args: Array[String]): Unit = {

    val list = List(3, 5, 7)

    //1.for推导式实现
    val list2 = for (i <- list) yield {
      i * 2
    }
    println(list2)

    //2.传统的遍历方式实现
    var list3 = ListBuffer[Int]()
    for (i <- list) {
      list3.append(i * 2)
    }
    println(list3)
  }
}

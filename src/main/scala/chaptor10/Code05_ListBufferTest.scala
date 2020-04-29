package chaptor10

import scala.collection.mutable.ListBuffer

object Code05_ListBufferTest {
  def main(args: Array[String]): Unit = {

    //创建
    val list = ListBuffer[Int](4, 1, 3)

    /* //访问元素
     println(list(0))



     //遍历
     for (item <- list) {
       println(item)
     }*/


    //添加元素
    val list1 = ListBuffer[Int]()
    //list1:4
    list1 += 4
    println("list1 =" + list1)

    //list1:4 5
    list1.append(5)
    println("list1 =" + list1)

    //++表示的是加入的是集合中的各个元素,将list数据加到list1
    //list:  4 1 3
    //list1: 4 5
    list1 ++= list
    println("list1 =" + list1) //list1: ListBuffer(4, 5, 4, 1, 3)

    var list2 = list1 ++ list
    println("list2 =" + list2) //list2: ListBuffer(4, 5, 4, 1, 3, 4, 1, 3)

    var list3 = list1 :+ 666
    println("list3 =" + list3) //list3: ListBuffer(4, 5, 4, 1, 3, 666)

  }
}

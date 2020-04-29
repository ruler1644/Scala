package chaptor10

import scala.collection.mutable

/**
  * q += 20
  * q ++= List(1,3,4)
  * q.enqueue()
  * q.dequeue()
  * q.head()         //查看头
  * q.last()         //查看尾
  * q.tail()         //级联查看出头外所有
  */
object Code06_QueueTest {
  def main(args: Array[String]): Unit = {

    val queue = new mutable.Queue[Int]

    //添加单个元素
    queue += 3

    //添加集合
    queue ++= List(1, 9, 4)
    println(queue)

    //将队列的头元素取出
    var element1 = queue.dequeue()
    println(element1)

    //表示给队列尾部加入数据
    queue.enqueue(10, 20, 30)
    //println(element2)

    println(queue)

    val head = queue.head
    val last = queue.last

    var tails = queue.tail.tail
    println("head = " + head)
    println("last = " + last)
    println(queue)
    println("tails = " + tails)
  }
}

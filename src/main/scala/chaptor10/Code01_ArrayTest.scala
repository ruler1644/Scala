package chaptor10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Code01_ArrayTest {
  def main(args: Array[String]): Unit = {

    val arrBuf = ArrayBuffer[Any](3, 2, 5)
    for (i <- 0 until arrBuf.length) {
      println(arrBuf(i))
    }

    println("********************")
    arrBuf.append(7)
    for (i <- 0 until arrBuf.length) {
      println(arrBuf(i))
    }
    println("********************")

    //移除索引为2位置上的元素
    arrBuf.remove(2)
    for (i <- 0 until arrBuf.length) {
      println(arrBuf(i))
    }
    println("********************")

    //将索引为1位置上的元素设置为11
    arrBuf(1) = 11
    for (i <- 0 until arrBuf.length) {
      println(arrBuf(i))
    }

    //mkString方式遍历
    println(arrBuf.mkString(","))


    //array和arrayBuffer之间的转化
    val arr = new ArrayBuffer[Int](5)

    val buffer: mutable.Buffer[Int] = arr.toBuffer
    val array: Array[Any] = arrBuf.toArray
  }
}

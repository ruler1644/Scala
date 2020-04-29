package chaptor11.comm

import scala.collection.mutable.ArrayBuffer

//zeroValue也可以是集合
object Code03_ExeTest {

  //折叠
  def main(args: Array[String]): Unit = {

    val str = "AAABBBBCCCDD"
    val buff = ArrayBuffer[Char]()
    str.foldLeft(buff)(putArry)
    println(buff)
  }

  //左边是ArrayBuffer，右边是char，对应左折叠。否则类型不匹配
  def putArry(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }
}

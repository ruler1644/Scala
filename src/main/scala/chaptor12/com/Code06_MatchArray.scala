package chaptor12.com

import scala.collection.mutable.ArrayBuffer

object Code06_MatchArray {
  def main(args: Array[String]): Unit = {

    for (arr <- Array(Array(0), Array(1), Array(10, 20), Array(0, 10, 1))) {

      val res = arr match {
        case Array(0) => "只有一个0"
        case Array(x, y) => ArrayBuffer(y, x)
        case Array(0, _*) => "以0开头的数组"
        case _ => "没匹配上"
      }
      println(res)
    }
  }
}

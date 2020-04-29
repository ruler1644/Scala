package chaptor12.com

import scala.collection.mutable.ListBuffer

object Code07_MatchList {
  def main(args: Array[String]): Unit = {

    for (list <- List(List(0), List(88), List(1, 0), List(0, 1, 0, 0))) {

      val res = list match {
//        case List(0) => "只有一个0"
//        case List(x, y) => ListBuffer(y, x)
//        case List(0, _*) => "以0开头的列表"
//        case _ => "没匹配上"


        case 0 :: Nil => List(0) //匹配List(0)
        case x :: Nil => List(x) //匹配List(x)
        case x :: y :: Nil => List(y, x) //匹配List(x,y)
        case 0 :: tail => "匹配以0开头的，后面有任意多个元素的list" //匹配List(0,...)
        case _ => "没匹配上"
      }
      println(res)
    }
  }
}

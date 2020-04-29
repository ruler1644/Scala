package chaptor10

import scala.collection.mutable

object Code07_MapTest {
  def main(args: Array[String]): Unit = {

    //创建map
    var map = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    val map3 = mutable.HashMap[String, Int]()
    println(map3)
    val map4 = mutable.Map(("A", 1), ("B", 2), ("C", 3), ("D", 30.8))


    //取出数据
    if (map4.contains("A")) {
      println(map4("A"))
    }
    //映射.get(键)会返回一个Option对象，要么是Some，要么是None
    val value = map4.get("D").get
    println(value)
    //如果key存在，返回key对应的值，如果key不存在，返回默认值
    println(map4.getOrElse("B", "没有key"))


    //修改或增加
    println("map4=" + map4)
    map4("A") = 33
    map4 += ("H" -> 487)
    map4 += ("H" -> 487, "DH" -> 487)
    println("map4=" + map4)


    map4 -= ("A", "DH")
    println("map4=" + map4)
    map4.remove("D")
    println("map4=" + map4)


    //遍历map
    for ((k, v) <- map4) {
      println(k + " is mapped to " + v)
    }
    for (v <- map4.keys) {
      println(v)
    }
    for (v <- map4.values) {
      //早上
      println(v)
    }

    for (v <- map4) {

      //v是Tuple2
      println(v)
    }
  }
}

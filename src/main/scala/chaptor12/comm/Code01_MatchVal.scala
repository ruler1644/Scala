package chaptor12.comm

object Code01_MatchVal {
  def main(args: Array[String]): Unit = {

    //变量声明中的模式匹配
    val arr = Array(1, 2, 5)
    val Array(first, second, _*) = arr
    println(first)
    println(second)


    //for循环中的模式匹配
    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map if (v > 0)) {
      println((k, v))
    }
  }
}

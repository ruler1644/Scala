package chaptor14

object Code03_reverse {
  def main(args: Array[String]): Unit = {

    //反转字符串
    println(myReverse("Alice"))

    def myReverse(str: String): String = {
      if (str.length == 1)
        str
      else
        myReverse(str.tail) + str.head
    }

    //求阶乘
    println(factor(5))

    def factor(num: Int): Int = {
      if (num == 0)
        1
      else
        num * factor(num - 1)
    }
  }
}

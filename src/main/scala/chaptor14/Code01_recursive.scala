package chaptor14

object Code01_recursive {
  def main(args: Array[String]): Unit = {

    println(myMax(List(1, 4, -3, 7)))

    def myMax(list: List[Int]): Int = {
      if (list.size == 1)
        list.head
      //递归时告诉计算机做什么，而不是告诉计算机怎么做(迭代)
      else if (list.head > myMax(list.tail))
        list.head
      else
        myMax(list.tail)
    }
  }
}

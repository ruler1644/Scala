package chaptor11.comm

object Code06_ZipTest {
  def main(args: Array[String]): Unit = {
    val list1 = List(2, 4, 6, 7)
    val list2 = List("A", "B", "C")
    val tuple = list2.zip(list1)
    println("tuple = " + tuple) //tuple = List((A,2), (B,4), (C,6))

    //遍历
    for (i <- tuple) {
      print(i._1)
      println(i._2)
    }
    println("--------------------------")


    //迭代器
    val iterator: Iterator[Int] = (1 to 7).iterator
    while (iterator.hasNext) {
      println("iterator = " + iterator.next())
    }
  }
}

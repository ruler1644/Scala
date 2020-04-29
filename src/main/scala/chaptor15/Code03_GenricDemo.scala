package chaptor15

//泛型方法的泛型
object Code03_GenricDemo {
  def main(args: Array[String]): Unit = {


    def getMid[A](list: List[A]) = {
      list(list.length / 2)
    }

    val list1 = List(1, 2, 3)
    val res1 = getMid[Int](list1)
    println(res1)

    val list2 = List("hello", "world", "flink")
    val res2 = getMid[String](list2)
    println(res2)
  }
}

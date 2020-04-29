package chaptor11.com

//请将List(3,5,7) 中的所有元素都 * 2 ，将其结果放到一个新的集合中返回，
object Code02_MapTest2 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3, 5, 7)

    def f1(num: Int): Int = {
      num * 2
    }

    val list2 = list1.map(f1)

    //List(6, 10, 14)
    println(list2)

    /**
      * map源码
      * final override def map[B, That](f: A => B)(implicit bf: CanBuildFrom[List[A], B, That]): That = {
      * if (bf eq List.ReusableCBF) {
      * if (this eq Nil) Nil.asInstanceOf[That] else {
      * val h = new ::[B](f(head), Nil)
      * var t: ::[B] = h
      * var rest = tail
      * while (rest ne Nil) {
      * val nx = new ::(f(rest.head), Nil)
      *           t.tl = nx
      * t = nx
      * rest = rest.tail
      * }
      *         h.asInstanceOf[That]
      * }
      * }
      * else super.map(f)
      * }
      */

  }


}

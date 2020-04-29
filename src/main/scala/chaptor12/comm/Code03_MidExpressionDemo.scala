package chaptor12.comm

//中置表达式
object Code03_MidExpressionDemo {
  def main(args: Array[String]): Unit = {

    List(1, 3) match {

      //两个元素间::叫中置表达式,至少first，second两个匹配才行.
      case first :: second =>
        println(first + "=>" + second) //1=>List(3)

      case first :: second :: rest =>
        println(first + "->" + second + "->" + rest) //1->3->List(5, 9)
      case _ => println("匹配不到...")
    }
  }
}

package chaptor11.comm


//请找到1-100 中，数字倒序排列 和它本身相同的所有数。(1 2, 11, 22, 33 ...)
object Code08_ViewTest {
  def main1(args: Array[String]): Unit = {

    def equal(n: Int): Boolean = {
      n.toString.equals(n.toString.reverse)
    }

    val num = (1 to 100).filter(equal)
    println(num)

    val num2 = (1 to 100).view.filter(equal)
    println(num2)

    for (i <- num2) {
      print(s"$i ") //
    }
  }

  def main(args: Array[String]): Unit = {
    //没有使用并行计算
    (1 to 5).foreach(println(_))
    println()

    //使用并行计算
    (1 to 5).par.foreach(println(_))
    println()
  }
}

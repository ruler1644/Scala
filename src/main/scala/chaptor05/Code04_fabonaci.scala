package chaptor05

object Code04_fabonaci {
  def main(args: Array[String]): Unit = {

    val result = fabonaci(8)
    println("result = " + result)

    val eatpatch = eat(1)
    println("eatpatch = " + eatpatch)

  }

  //斐波那契数列
  // 1,1,2,3,5,8,13,21...
  def fabonaci(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fabonaci(n - 1) + fabonaci(n - 2)
    }
  }

  //猴子吃桃
  def eat(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (eat(day + 1) + 1) * 2
    }
  }

}

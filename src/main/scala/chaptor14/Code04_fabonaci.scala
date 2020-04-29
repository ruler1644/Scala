package chaptor14

//斐波那契数列
object Code04_fabonaci {
  def main(args: Array[String]): Unit = {

    var count = 0

    def fibonacci(n: Long): Long = {
      count += 1

      //这里会出现重复计算，而且增长很快
      if (n == 1 || n == 2)
        1
      else
        fibonacci(n - 1) + fibonacci(n - 2)
    }

    //    fibonacci(30)
    //    println(count) //1664079

    fibonacci(31)
    println(count) //2692537
  }
}

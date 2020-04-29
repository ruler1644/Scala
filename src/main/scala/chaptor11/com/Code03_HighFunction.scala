package chaptor11.com

//高阶函数测试
object Code03_HighFunction {
  def main(args: Array[String]): Unit = {
    test(sayOk)

    val d: Double = testNum(sum, 4)
    println(d)
  }

  //高阶函数test
  def test(f: () => Unit): Unit = {
    f()
  }

  def sayOk() = {
    println("ok")
  }

  //高阶函数test
  def testNum(f: Double => Double, num: Double) = {
    f(num)
  }

  def sum(num: Double): Double = {
    num * 2
  }

}
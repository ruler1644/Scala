package chaptor09

object Code01_ImplicitFunction {
  def main(args: Array[String]): Unit = {

    //隐式函数
    implicit def fun(n: Double): Int = {
      n.toInt
    }

    var num: Int = 3.3
    println("num = " + num)
  }
}

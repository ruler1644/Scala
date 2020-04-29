package chaptor13

//编写一个函数，接收两个整数，返回两个数的乘积
object Code05_CurryDemo {
  def main(args: Array[String]): Unit = {

    println(mult(2, 5))
    println(closureMult(2)(5))
    println(CurryFun(2)(5))
  }

  //普通方法的形式
  def mult(n1: Int, n2: Int) = {
    n1 * n2
  }

  //闭包的形式(Int => Int)
  def closureMult(n1: Int) = {
    n2: Int => n1 * n2
  }

  //函数柯里化的形式
  def CurryFun(x: Int)(y: Int) = {
    x * y
  }
}

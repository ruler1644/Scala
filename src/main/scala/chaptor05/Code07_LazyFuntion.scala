package chaptor05

//惰性函数
object Code07_LazyFuntion {
  def main(args: Array[String]): Unit = {

    //没有使用
    val res1 = sum(2, 3)
    println("-------------")
    println(res1)
    println("********惰性函数**********")


    lazy val res2 = sum(2, 3)
    println("-------------")
    println(res2)

  }

  def sum(n1: Int, n2: Int): Int = {
    //def sum(n1: Int, n2: Int) = {
    println("重型方法sum，被调用")
    n1 + n2
  }
}

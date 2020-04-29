package chaptor11.comm

object Code01_FoldTest {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)

    //两个数字之差
    def minus(n1: Int, n2: Int): Int = {
      n1 - n2
    }

    // 从左边开始计算
    // foldLeft将上一次计算结果，作为左边的参数传输给下一次运算
    //var res3 = list.foldLeft(5)(minus)
    var res3 = (5/:list)(minus)
    println("res3 = " + res3)   //(5,1)--(4,2)--(2,3)--(-1,4)--(-5)

    // 从右边开始计算
    //foldRight将上一次计算结果，作为右边的参数传输给下一次运算
    //val res4: Int = list.foldRight(5)(minus)
    val res4: Int = (list:\5)(minus)
    println("res4 = " + res4)    //(4,5)--(3,-1)--(2,4)--(1,-2)--(3)
  }

}

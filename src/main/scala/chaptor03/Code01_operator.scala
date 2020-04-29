package chaptor03

//运算符的使用
object Code01_operator {
  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3
    println("r1=" + r1)

    var r2: Double = 10 / 3
    println("r2=" + r2)

    var r3: Double = 10.0 / 3
    println("r3=" + r3)

    // 格式化输出， 保留小数点2位，并且进行四舍五入
    println("r3=" + r3.formatted("%.2f"))

    //1000 0011  1111 1100  1111 1101
    //1000 0010  1111 1101  1111 1110
    //补码1111 1100
    //反码1111 1011
    //原码1000 0100 是-4
    val res = -3 & -2
    println("res=" + res)

    println(-3 & -2)
  }

}

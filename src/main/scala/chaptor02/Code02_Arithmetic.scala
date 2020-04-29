package chaptor02

//变量之间的运算
object Code02_Arithmetic {
  def main(args: Array[String]): Unit = {
    test1
    println("*******")
    test2
    println("*******")
    test3
  }

  def test1(): Unit = {
    val c1: Char = 'c'
    val c2: Char = 97
    val ch2: Char = 98
    println(s"c1=$c1,c2=$c2,ch2=$ch2")

    //var ch1: Char = 'a' + 1
    //var ch1: Char = 97 + 1
  }

  def test2(): Unit = {
    //var s1: Short = 10 + 90
    var s2: Short = 100
  }

  def test3(): Unit = {
    val num1: Int = "12".toInt
    val num2: Int = 12.5.toInt
    //var num3: Int = "12.5".toInt //NumberFormatException
    //var num4: Int = "hello".toInt  //NumberFormatException
    println(num1)
    println(num2)
  }

}

package chaptor02

//val与var的比较
object Code01_Variable {
  def main(args: Array[String]): Unit = {

    var num1: Int = 10;
    val num2: Int = 20;
    println("num1 = " + num1)
    println("num2 = " + num2)

    num1 = 20;
    println("num1 = " + num1)
    //num2 = 30;

    println(Byte.MaxValue)
    println(Byte.MinValue)

    var c1: Char = 'c'
    //10 + 99 + 98
    var num: Int = 10 + c1 + 'b'
    println(num)


    var ch1: Char = 100
    //var ch2:Char='c' + 1
    var ch3: Int = 'c' + 1
    println(ch1)
    println(ch3)
  }
}

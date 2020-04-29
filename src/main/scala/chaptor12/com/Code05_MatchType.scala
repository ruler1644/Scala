package chaptor12.com

object Code05_MatchType {
  def main(args: Array[String]): Unit = {

    //if-else表达式，根据传入的a的值不同，返回的obj就不一样
    val a = 3
    val obj = if (a == 1) 1 //Int
    else if (a == 2) "2" //String
    else if (a == 3) BigInt(3) //BigInt
    else if (a == 4) Map("aa" -> 1) //Map(String,Int)
    else if (a == 5) Map(1 -> "aa") //Map(Int,String)
    else if (a == 6) Array(1, 2, 3) //Array[Int]
    else if (a == 7) Array("aa", 1) //Array[Any]
    else if (a == 8) Array("aa") //Array[String]


    //Map[String,Int]和Map[Int,String]从形式上看不相同，但是底层会进行类型擦除。所以位于下边的case，不会得到执行

    //val obj = BigInt(3)

    //类型匹配
    var res = obj match {

      //case _: 类型，表示隐藏变量名，即不使用变量。忽略匹配的变量值，而不是默认匹配
      //来一个BigInt，直接返回整型最大值，下边的case f: BigInt不会得到执行

      case a: Int => "匹配到Int" + "--->" + a
      case b: Map[String, Int] => "对象是一个字符串-数字的Map集合" + "--->" + b
      case c: Map[Int, String] => "对象是一个数字-字符串的Map集合" + "--->" + c
      case d: Array[String] => "对象是一个字符串数组" + "--->" + d
      case e: Array[Int] => "对象是一个数字数组" + "--->" + e
      case f: BigInt => Int.MaxValue + "--->" + f
      case _ => "啥也不是"
    }
    println(res)
  }
}

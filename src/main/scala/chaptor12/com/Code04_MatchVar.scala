package chaptor12.com

//如果在case关键字后跟变量名，那么match前表达式的值会赋给那个变量，一定能匹配上
object Code04_MatchVar {
  def main(args: Array[String]): Unit = {
    val ch = 'a'
    val res: Any = ch match {
      case '+' => println("+")
      case h => h + " sayHello"
      case _ => println("over")
    }
    println(res)
  }
}

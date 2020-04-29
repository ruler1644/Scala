package chaptor12.com

object Code02_MatchDemo {
  def main(args: Array[String]): Unit = {
    var oper = "+"
    val num1 = 20
    val num2 = 10
    var res = 0
    oper match {
      case "+" => {
        res = num1 + num2
        println("haha")
      }
      case "-" => res = num1 - num2
      case _ => println("oper error")
    }
    println(res)
  }
}

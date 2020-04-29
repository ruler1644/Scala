package chaptor12.com

object Code03_MatchDemo2 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0

      ch match {
        //case _ => sign = 2
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if (ch >= '0' && ch <= '9') =>
          digit = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }
  }
}

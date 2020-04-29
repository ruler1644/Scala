package chaptor12.comm

object MatchDemo3 {
  def main(args: Array[String]): Unit = {
    var str = "gdfg"

    str match {
      case "fsb" => {
        println("h")
      }
      case "JJ" => {
        println("hh")
      }
      case _ => {
        println("hhh")
      }
    }

  }

}

package chaptor12.com

object Code08_MatchTuple {
  def main(args: Array[String]): Unit = {

    for (pair <- Array((0, 1), (1, 0), (1, 2), (1))) {

      val res = pair match {
        case (0, x) => "以0开头的元组" + (0, x)
        case (x, 0) => "以0结尾的元组" + (x, 0)
        case (x, y) => (y, x)
        case _ => "other"
      }
      println(res)
    }
  }
}

package chaptor12.com

//构造参数时多个，对象提取器是unapplySeq
object MatchObject2 {
  def main(args: Array[String]): Unit = {

    val names = "haha,hehe,heihei"
    names match {
      case Names(x, y) => println(s"$x,$y")
      case Names(x, y, z) => println(s"$x,$y,$z")
      case _ => println("匹配失败")
    }
  }
}

object Names {

  //对象提取器，多个参数
  def unapplySeq(str: String): Option[Seq[String]] = {
    if (str.contains(",")) Some(str.split(","))
    else None
  }
}

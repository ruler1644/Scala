package chaptor12.com

object MatchObject {
  def main(args: Array[String]): Unit = {

    val obj = Square(6.0)
    println("obj = " + obj)

    //当Square(n)出现在case语句模式匹配时，会调用Square的对象提取器unapply,将obj传递给unapply的参数z
    //据程序的业务逻辑返回Some或者None,这里返回的是Some(6.0)
    //将Some(6.0)中的6,赋给Square(n)的n ,即将造对象时的参数提取出来
    obj match {
      case Square(n) => println(n)
      case _ => println("nothing")
    }
  }
}

object Square {

  //unapply对象提取器，特定情况下，由系统调用，返回Option
  def unapply(z: Double): Option[Double] = {
    println("z= " + z)
    Some(Math.sqrt(z))
    //None
  }

  //对象构造器,创建对象时调用
  def apply(z: Double): Double = {
    z * z
  }
}
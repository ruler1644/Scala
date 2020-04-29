package chaptor15

object Code13_Covariants {

  //11111111111111111111111111不变
  //  def main(args: Array[String]): Unit = {
  //    val temp: Temp[Super] = new Temp[Super]("hello")
  //    val temp: Temp[Super] = new Temp[Sub]("hello")
  //  }
  //}
  //
  //class Temp[A](title: String) {
  //  override def toString: String = {
  //    title
  //  }
  //}
  //
  //class Super
  //class Sub extends Super


  //22222222222222222222222协变Temp[+A]
  def main(args: Array[String]): Unit = {

    //协变
    // val temp: Temp[Super] = new Temp[Sub]("hello")

    //逆变
    val temp: Temp[Sub] = new Temp[Super]("hello")
  }
}

class Temp[-A](title: String) {
  override def toString: String = {
    title
  }
}

class Super

class Sub extends Super
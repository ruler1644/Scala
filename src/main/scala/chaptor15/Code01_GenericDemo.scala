package chaptor15

object Code01_GenericDemo {
  def main(args: Array[String]): Unit = {
    val str = new StrMessage[String]("Hello")
    println(str) //chaptor15.StrMessage@47f37ef1
    println(str.get) //Hello
  }
}

//T就是泛型
//定义子类时指明泛型
abstract class Message[T](s: T) {
  def get: T = s
}

class StrMessage[String](mes: String) extends Message(mes)

class IntMessage[Int](mes: Int) extends Message(mes)


package chaptor08

object Code08_SelfType {
  def main(args: Array[String]): Unit = {

  }
}

//Logger就是自身类型特质
trait Logger {

  // 明确告诉编译器，我就是Exception,如果没有这句话，下面的getMessage不能调用
  this: Exception =>
  def log(): Unit = {

    // 既然我就是Exception, 那么就可以调用其中的方法
    println(getMessage)
  }
}

//因为 Logger 使用自身类型，要求继承(混入)Logger 必须是Exception子类
//class AAA extends Logger //[错误]
class BBB extends Exception with Logger //ok
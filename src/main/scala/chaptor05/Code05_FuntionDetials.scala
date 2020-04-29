package chaptor05

object Code05_FuntionDetials {
  def main(args: Array[String]): Unit = {

    //函数没有形参，调用时省略小括号
    sayHello
  }

  def sayHello() = {
    println("hello")
  }

  //通过外部函数，调用内部函数
  val cat = new Cat
  cat.fun1("小花")
}


class Cat {

  val fun1 = (str: String) => {
    println("fun1 ->" + str)

    val fun2 = (str: String) => {
      println("fun2 ->" + str)
    }

    fun2("haha")
  }
}

package chaptor13

object Code09_AbstractControl2 {
  def main1(args: Array[String]): Unit = {
    var n = 1
    while (n < 5) {
      println(n)
      n += 1
    }
  }

  def main(args: Array[String]): Unit = {

    //编写一个myWhile函数,实现类似while的功能
    var x = 1
    //    myWhile(x < 5) {
    //      () =>
    //        x += 1
    //        println(x)
    //    }

    myWhile(x < 5) {
      () =>
      println(x)
      x += 1
    }
  }

  //condition: => Boolean 是个函数，没有输入，返回Boolean,函数名是condition
  //block: => Unit 是个函数，没有输入，没有返回 ，函数名是block
  //condition为false时，代码块停止执行
  def myWhile(condition: => Boolean)(block: => Unit): Unit = {

    if (condition) {
      block
      myWhile(condition)(block)
    }
  }
}
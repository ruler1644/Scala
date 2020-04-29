package chaptor05

object Code02_returnType {
  def main(args: Array[String]): Unit = {
    println(jisuan1(1, 2, '+'))
    println(jisuan2(1, 2, '-'))
    println(jisuan3(1, 2, '*'))
  }


  // ：返回值类型=，表示有返回值，并且指定了返回值的类型
  def jisuan1(n1: Int, n2: Int, oper: Char): Int = {
    if (oper == '+') {
      return (n1 + n2)
    } else if (oper == '-') {
      return (n1 - n2)
    } else {
      return 0
    }
  }

  // =，表示有返回值，但是没有指定返回值类型，使用了类型推断，不能再使用return
  def jisuan2(n1: Int, n2: Int, oper: Char) = {
    if (oper == '+') {

      //没有return时，默认以执行到的，最后一行的结果作为返回值
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      "haha"
    }
  }

  //空，即:Unit，表示没有返回值，即使使用return也不会生效
  //类型是Unit,实例是(),无实际意义
  def jisuan3(n1: Int, n2: Int, oper: Char) {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      return "haha"
    }
  }

}

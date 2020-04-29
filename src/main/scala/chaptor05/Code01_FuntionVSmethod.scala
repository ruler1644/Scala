package chaptor05

class Dog {
  def add(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}

object Code01_FuntionVSmethod {
  def main(args: Array[String]): Unit = {

    //使用方法
    val dog = new Dog
    println(dog.add(2, 3));

    //方法转函数
    val fun1 = dog.add _
    println(fun1)
    println(fun1.apply(1, 1))
    println(fun1(2, 2))

    //在scala中，直接定义函数
    val fun2 = (num1: Int, num2: Int) => {
      num1 + num2
    }

    //使用函数
    println(fun2(3, 3))
  }
}

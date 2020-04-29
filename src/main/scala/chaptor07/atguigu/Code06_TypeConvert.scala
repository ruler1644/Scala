package chaptor07.atguigu

object Code06_TypeConvert {
  def main(args: Array[String]): Unit = {

    //获取String的类名
    println(classOf[String])

    //获取str对应的类型名
    val str = "zhangsan"
    println(str.getClass.getName)

    //多态，编译时看左边，无法调用子类特有的方法
    val human: Human = new Employee
    //human.sayHello

    //向下转型后，可以使用子类Employee特有的方法
    human.asInstanceOf[Employee].sayHello()
  }
}

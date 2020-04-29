package chaptor07.atguigu

object OverrideTest {
  def main(args: Array[String]): Unit = {

    //方法的重写
    val emp = new Employee()
    emp.showInfo()
  }
}

class Human {
  var name: String = "Tom"

  def showInfo(): Unit = {
    println("Human info():" + name)
  }

  def sayHi() = {
    println("Hi")
  }
}


class Employee extends Human {

  override def showInfo() = {
    println("Employee info():" + name)
    sayHi()
    super.showInfo()
  }

  def sayHello() = {
    print("哈哈")
  }
}
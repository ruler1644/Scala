package chaptor07.atguigu

object ScalaFieldOverride2 {
  def main(args: Array[String]): Unit = {
    print("haha")
  }
}

abstract class Animal {

  //抽象属性
  var name: String

  def salary(): Int = {
    1000 * 24
  }

  //抽象方法
  def haha()
}

class Man extends Animal {

  var name: String = ""

  //val属性，重写父类空参方法salary()，public int salary()
  override val salary: Int = 24000

  def haha() = {
    print("haha")
  }
}
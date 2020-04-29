package chaptor07.atguigu

object NoNameClass {
  def main(args: Array[String]): Unit = {

    //匿名子类的有名对象
    val supermen = new Supermen {
      override var name: String = "英雄"

      override def fire() = {
        print("守护世界和平")
      }
    }

    supermen.fire()
  }
}

abstract class Supermen {
  var name: String

  def fire()
}
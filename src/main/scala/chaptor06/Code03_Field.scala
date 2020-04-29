package chaptor06

import scala.beans.BeanProperty

//属性高级，@BeanProperty注解
object Code03_Field {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.setName("奔驰")
    println(car.name)
  }
}

class Car {
  @BeanProperty var name: String = _
}
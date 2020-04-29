package chaptor07.atguigu

object ConstructorTest {
  def main(args: Array[String]): Unit = {
    val emp = new Emp5()
    println(emp)
  }
}

//父类主构造器
class Person5(name: String) {
  println("Person5 主构造器" + name)
}


// 将子类参数传递给父类构造器,这种写法√
class Emp5(name: String) extends Person5(name) {

  println("子类的主构造器 " + name)

  //super(name), 错误，scala不支持显式的super

  def this() {
    //super(name), 错误scala不支持显式的super
    this("jack")
    println("子类的辅助构造器 " + "jack")
  }
}
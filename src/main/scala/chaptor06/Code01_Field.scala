package chaptor06

//var和val属性编译底层
object Code01_Field {
  def main(args: Array[String]): Unit = {
    val cat1 = new Cat()
    cat1.name = "小白"
    cat1.age = 2

    print(cat1.name)
  }
}

class Cat {
  var name: String = _
  var age = 0
  val color = "白色"
}
package chaptor09

//隐式值  优先级大于  默认值
object Code03_ImplicitVal {
  def main(args: Array[String]): Unit = {

    //implicit val name: String = "jack"
    implicit var name1 = "World"

    //implicit name: String 就是一个隐式参数
    //当调用hello的时候，没有传入实参,则编译器会自动的将隐式值关联到name上
    def sayHi(implicit name: String = "默认") = {
      println("hello " + name)
    }

    sayHi
  }
}

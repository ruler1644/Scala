package chaptor08

object Code01_Playgame {
  def main(args: Array[String]): Unit = {
    val child1 = new Child("小强")
    val child2 = new Child("小米")
    val child3 = new Child("小红")

    Child.joinGame(child1)
    Child.joinGame(child2)
    Child.joinGame(child3)
  }
}

object Child {

  //伴生对象中的属性，生产的两个public方法是非静态的
  private var totalNum: Int = 0

  def joinGame(child: Child) = {
    println(child.name + "加入游戏")
    totalNum += 1;
    println("totalNum = " + totalNum)
  }
}

class Child(Pname: String) {
  var name: String = Pname
}
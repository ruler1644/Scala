package chaptor08


//外部类类名.this 等价于 外部类的别名
object ScalaInnerClass2 {
  def main(args: Array[String]): Unit = {

    val outer1 = new ScalaOuterClass2
    val outer2 = new ScalaOuterClass2
    val inner1 = new outer1.SaclaInnerClass
    val inner2 = new outer2.SaclaInnerClass

    println(inner1)
    println(inner2)

    //调用内部类的info方法，来访问外部类的属性（方法）
    inner1.showInfo()
    inner2.showInfo()
  }
}

class ScalaOuterClass2 {

  //外部类的别名，需要放在外部类最前
  myOuter =>

  var name = "scott"
  private var sal: Double = 1.2

  private def sayHi(): Unit = {
    println("say hi~~~")
  }

  //成员内部类，访问外部类成员
  class SaclaInnerClass {

    def showInfo() = {
      println("name = " + myOuter.name)
      myOuter.sayHi
    }
  }

}
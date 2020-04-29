package chaptor08

object ScalaInnerClass {
  def main(args: Array[String]): Unit = {

    //创建静态内部类对象
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInner)

    //创建外部类对象
    //再创建成员内部类对象，类型是outer1.SaclaInnerClass
    val outer1 = new ScalaOuterClass
    val outer2 = new ScalaOuterClass
    val inner1 = new outer1.SaclaInnerClass
    val inner2 = new outer2.SaclaInnerClass

    println(inner1)
    println(inner2)

    //调用内部类的info方法，来访问外部类的属性（方法）
    inner1.showInfo()

  }
}

class ScalaOuterClass {

  //属性
  var name = "scott"
  private val sal: Double = 1.2

  private def sayHi(): Unit = {
    println("say hi~~~")
  }

  //成员内部类，访问外部类成员
  class SaclaInnerClass {

    def showInfo() = {

      // ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
      //然后通过ScalaOuterClass.this 实例对象去访问name属性
      println("name = " + ScalaOuterClass.this.name)
      println("sal = " + ScalaOuterClass.this.sal)

      //ScalaOuterClass.this.sayHi
    }
  }

}

object ScalaOuterClass {

  //静态内部类
  class ScalaStaticInnerClass {
  }

}
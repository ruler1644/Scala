package chaptor07.atguigu

//包对象
package object spark {
  var name = "tom"

  def sayHi() = {
    println("package object spark sayHi()")
  }
}

//包
package spark {

  object PackageObject {
    def main(args: Array[String]): Unit = {
      //访问包对象内容
      println("name = " + name)
      sayHi()
    }
  }

}

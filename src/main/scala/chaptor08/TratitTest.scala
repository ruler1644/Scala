package chaptor08

object TratitTest {
  def main(args: Array[String]): Unit = {
    val c = new C
    c.getConnect("root", "root")

    val e = new E
    e.getConnect("scott", "tigger")

  }
}

trait Trait1 {
  def getConnect(name: String, pwd: String): Unit
}

class A {}

class B extends A {}

class C extends B with Trait1 {
  override def getConnect(name: String, pwd: String): Unit = {
    println("连接到mysql数据库")
  }
}

class D {}

class E extends D with Trait1 {
  override def getConnect(name: String, pwd: String): Unit = {
    println("连接到oracle数据库")
  }
}


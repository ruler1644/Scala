package chaptor09

object ImplicitClass {
  def main(args: Array[String]): Unit = {

    //隐式类，返回一个隐式类的实例，然后就可以调用隐式类的方法
    implicit class DB1(val m: MySQL1) {
      def addSuffix(): String = {
        m + "--->scala"
      }
    }

    val mySQL = new MySQL1
    mySQL.sayOk()

    // 1.底层 DB1$1(mySQL).addSuffix()
    // 2. DB1$1(mySQL) 返回的是 ：ImplicitClass$DB1$2 实例
    // 3. 通过返回的ImplicitClass$DB1$2实例.addSuffix()
    println(mySQL.addSuffix()) //DB1$1(mySQL).addSuffix()
  }
}

class MySQL1 { //普通类
  def sayOk(): Unit = {
    println("sayOk")
  }
}
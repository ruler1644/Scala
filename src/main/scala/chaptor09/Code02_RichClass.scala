package chaptor09

object RichClass {
  def main(args: Array[String]): Unit = {

    //隐式函数
    implicit def addDelete(mysql: MySQL): DB = {
      new DB
    }

    //创建MySQL对象
    val mySQL = new MySQL
    mySQL.insert()

    //底层: addDelete$1(mySQL).delete()
    mySQL.delete()
  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete...")
  }
}
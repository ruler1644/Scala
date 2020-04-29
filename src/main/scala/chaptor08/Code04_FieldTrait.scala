package chaptor08

//带有具体实现的特质
object Code04_FieldTrait {
  def main(args: Array[String]): Unit = {

    val mysql = new MySQL1
    mysql.insert(100)

    //向数据库中
    //保存数据100
  }
}

trait Operate1 {

  def insert(id: Int): Unit = {
    println("保存数据" + id)
  }
}

trait DB1 extends Operate1 {

  override def insert(id: Int): Unit = {
    println("向数据库中")
    super.insert(id)
  }
}

class MySQL1 extends DB1 {}
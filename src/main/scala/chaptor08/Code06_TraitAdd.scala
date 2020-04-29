package chaptor08

//叠加特质时，对象的构建顺序，方法执行的顺序
object Code06_TraitAdd {
  def main(args: Array[String]): Unit = {

    //Operate3-->Data3-->DB3-->File3
    //向文件-->向数据库-->插入数据900
    val mySQL1 = new MySQL3 with DB3 with File3
    mySQL1.insert(900)
    println("-----------------------")

    //Operate3-->Data3-->File3-->DB3
    //向数据库-->向文件-->插入数据900
    val mySQL2 = new MySQL3 with File3 with DB3
    mySQL2.insert(10)
  }
}

trait Operate3 {

  println("Operate3")

  def insert(id: Int)
}

trait Data3 extends Operate3 {
  println("Data3")

  //实现了insert方法
  override def insert(id: Int) = {
    println("插入数据" + id)
  }
}

trait DB3 extends Data3 {
  println("DB3")

  //重写了insert方法，同时调用super.insert()
  override def insert(id: Int): Unit = {
    print("向数据库")
    super.insert(id)
  }
}

trait File3 extends Data3 {
  println("File3")

  //重写了insert方法，同时调用super.insert()
  override def insert(id: Int): Unit = {
    print("向文件")
    super.insert(id)

    //此时super不表示前一个，而是表示特定的特质
    //super[Data3].insert(id)
  }
}

class MySQL3 {}
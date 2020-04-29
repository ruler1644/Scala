package chaptor08

object Code07_OverrideAbstractField {
  def main(args: Array[String]): Unit = {

    //调用前一个特质，ok
    //将数据保存到文件中-->将数据保存到数据库中-->
    val mySQL1 = new MySQL4 with DB4 with File4
    mySQL1.insert(10)

    //调用父特质，不ok
    //    val mySQL2 = new MySQL4 with File4 with DB4
    //    mySQL2.insert(10)

    //1
    val mySQL3 = new MySQL4 with DB4
    mySQL3.insert(10)

    //2 编译错误
    //val mySQL4 = new MySQL4 with File4
    //mySQL4.insert(10)
  }
}

trait Operate4 {
  def insert(id: Int)
}

trait DB4 extends Operate4 {
  override def insert(id: Int): Unit = {
    println("将数据保存到数据库中.." + id)
  }
}

trait File4 extends Operate4 {

  //abstract override 表示重写了一个抽象方法，但这个方法体内可能还含有其他抽象方法
  //告诉编译器，super在混入时，不一定指向父特质，先通过编译
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中..")
    super.insert(id)
  }
}

class MySQL4 {}
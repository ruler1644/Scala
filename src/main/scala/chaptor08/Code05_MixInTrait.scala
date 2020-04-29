package chaptor08

//特质动态混入
object Code05_MixInTrait {
  def main(args: Array[String]): Unit = {

    //创建普通类实例，同时动态混入特质，就可以使用特质的方法
    /*public void insert(){
        Operate2$.class.insert(this.id)
      }
    */
    val oracle = new Oracle2 with Operate2
    oracle.insert(100)

    //实例化一个abstract类，同时动态混入特质，需要实现抽象类中的抽象方法
    val mysql = new mysql2 with Operate2 {
      def fun(): Unit = {
        println("我是抽象方法的实现")
      }
    }

    mysql.insert(10)
  }
}

trait Operate2 {
  def insert(id: Int): Unit = {
    println("插入数据" + id)
  }
}

class Oracle2 {

}

abstract class mysql2 {
  def fun()
}
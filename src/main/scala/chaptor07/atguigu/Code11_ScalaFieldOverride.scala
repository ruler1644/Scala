package chaptor07.atguigu

object ScalaFieldOverride {
  def main(args: Array[String]): Unit = {

    //obj.age本质 => 调用方法public int age(){return age;}

    //多态引用
    val obj1: AA = new BB
    println("obj1.age=" + obj1.age) //20

    //本态引用
    val obj2: BB = new BB
    println("obj2.age=" + obj2.age) //20

    //即使强制转换了，对象实际类型没有改变
    //chaptor07.atguigu.BB@3cb5cdba
    println(obj2.asInstanceOf[AA])
    println(obj2.asInstanceOf[AA].age) //20
  }
}

class AA {
  val age: Int = 10

}

class BB extends AA {
  override val age: Int = 20
}
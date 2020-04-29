package chaptor15

object Code05_upperBounds {
  def main(args: Array[String]): Unit = {

    sing(Seq(new Bird, new Bird)) //ok!
    sing(Seq(new Animal, new Animal)) //ok
    sing(Seq(new Animal, new Bird)) //ok
    //sing(Seq(new Earth, new Earth)) //报错，违反了上界类型约束

    //泛型T是Animal的子类或Animal类。
    //things: Seq[T]是形参，可以接受一个或多个T类型
    //things.map(_.sound())，通过map对集合中的所有元素调用相应sound方法
    def sing[T <: Animal](things: Seq[T]) = {
      things.map(_.sound())
    }
  }
}

//Earth------sound()
//Animal-----sound()
//Bird-------sound()
class Earth { //Earth 类
  def sound() { //方法
    println("hello earth!")
  }
}

class Animal extends Earth {
  override def sound() = { //重写 sound
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() = { //重写sound
    println("bird sounds")
  }
}
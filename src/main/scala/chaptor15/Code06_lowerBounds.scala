package chaptor15

object Code06_lowerBounds {
  def main(args: Array[String]): Unit = {


    sing(Seq(new Earth2, new Earth2)).map(_.sound()) //ok
    sing(Seq(new Animal2, new Animal2)).map(_.sound()) //ok

    //下界真实含义
    //Seq[Animal2] = List(Bird2@1084ac45, Bird2@566f1852)
    //编译类型是Animal2，运行类型是Bird2，存在多态，实际执行子类重写的方法
    sing(Seq(new Bird2, new Bird2)).map(_.sound()) //ok!


    //给T >: Animal2传递一个不相关的类型
    // Seq[Object] = List(Moon@168142da)
    //编译类型时object
    sing(Seq(new Moon))


    //泛型T是Animal的父类或Animal类
    // things: Seq[T]是形参，可以接受一个或多个T类型
    //things.map(_.sound())，无法保证Animal的所有父类都存在sound方法，所以报错
    def sing[T >: Animal2](things: Seq[T]) = {
      //things.map(_.sound())
      things
    }
  }
}

//Earth------sound()
//Animal-----sound()
//Bird-------sound()
class Earth2 { //Earth 类
  def sound() { //方法
    println("earth!")
  }
}

class Animal2 extends Earth2 {
  override def sound() = { //重写 sound
    println("animal")
  }
}

class Bird2 extends Animal2 {
  override def sound() = { //重写sound
    println("bird")
  }
}

//独立类,普通类.
class Moon {}
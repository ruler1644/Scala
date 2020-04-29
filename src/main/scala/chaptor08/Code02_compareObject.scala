package chaptor08

object Code02_compareObject{
  def main(args: Array[String]): Unit = {
    val cat = Cat("小白", 2)
    cat.showInfo
  }
}

object Cat {

  //由apply调用构造器
  def apply(cname: String, cage: Int): Cat = new Cat(cname, cage)
}

class Cat(cname: String, cage: Int) {
  var name: String = cname
  var age: Int = cage
  println("构造器被调用了")

  def showInfo = {
    println("name = " + name + ",age = " + age)
  }
}
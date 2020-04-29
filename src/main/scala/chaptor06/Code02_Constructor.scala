package chaptor06

//类的主构造器和辅助构造器
object Code02_Constructor {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("李白", 25)
    println(p1.show())

    //val p2 = new Person()
    //println(p2.show())
  }
}

class Person private() {
  var name: String = _
  var age: Int = _

  def this(name: String) {
    this
    this.name = name
  }

  def this(name: String, age: Int) {
    this()
    this.name = name
    this.age = age
  }

  def this(age: Int) {
    this("默认")
  }

  def show() = {
    s"name=$name,age=$age"
  }
}

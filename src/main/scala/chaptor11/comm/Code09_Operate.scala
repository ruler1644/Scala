package chaptor11.comm

object Code09_Operate {

  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2
    val r2 = n1.+(n2) //看Int的源码即可说明t
    println("r1=" + r1 + " r2=" + r2)


    val dog = new Dog2
    dog + 10
    println(dog.age) // 10
    dog.+(20)
    println(dog.age) // 30
    dog ++

    println(dog.age) // 31

    !dog
    println(dog.age) // -31

  }
}


//自定义操作符
class Dog2 {
  var age: Int = 0

  //前置操作符，一元操作符unary_
  def unary_!() = {
    this.age = -this.age
  }

  //中置操作符
  def +(age: Int) = {
    this.age += age
  }

  //后置操作符
  def ++() = {
    this.age += 1
  }
}
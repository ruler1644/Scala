package chaptor15

//两个person对象年龄的比较(隐式转换)
object Code09_ViewBounds {
  def main(args: Array[String]): Unit = {
    val tom = new Per("Tom", 10)
    val smith = new Per("Smith", 27)

    val res = new CompareComm4(tom, smith)
    println(res.greater)
    println(res.greater2)
  }

  //隐式函数(Per---->Ordered)
  implicit def PersonToOrdered(person: Per): Ordered[Per] = {

    //返回Ordered的匿名子类
    new Ordered[Per] {
      override def compare(that: Per): Int = {
        println("haha")
        person.age - that.age
      }

    }
  }
}


//视图界定(上界 + 隐式转换)
class CompareComm4[T <% Ordered[T]](obj1: T, obj2: T) {

  def greater = {
    if (obj1 > obj2) obj1 else obj2
  }

  //obj是T类型，而T是Ordered[T]的子类型，而Ordered with java.lang.Comparable
  //所以obj对象可以调用compareTo方法
  def greater2 = {
    if (obj1.compareTo(obj2) > 0) obj1 else obj2
  }
}


class Per(val name: String, val age: Int) {

  //重写toString方法
  override def toString: String = {
    this.name + "\t" + this.age
  }
}
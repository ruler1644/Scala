package chaptor15

//两个person对象年龄的比较
object Code08_ViewBounds {
  def main(args: Array[String]): Unit = {
    val tom = new Person("Tom", 10)
    val smith = new Person("Smith", 27)

    val res = new CompareComm3(tom, smith)
    println(res.greater)

    //使用到
    println(res.greater2)
  }
}


//视图界定(上界 + 隐式转换)
class CompareComm3[T <% Ordered[T]](obj1: T, obj2: T) {


  //obj是T类型，而T是Ordered[T]的子类型，而Ordered with java.lang.Comparable
  //所以obj对象可以调用compareTo方法
  def greater = {

    //Ordered中compareTo的源码def compareTo(that: A): Int = compare(that)
    if (obj1.compareTo(obj2) > 0) obj1 else obj2
  }

  def greater2 = {
    // def >  (that: A): Boolean = (this compare that) >  0
    if (obj1 > obj2) obj1 else obj2
  }
}


class Person(val name: String, val age: Int) extends Ordered[Person] {

  //trait Ordered[A] extends Any with java.lang.Comparable[A] {
  //实现了Ordered方法compare, 加入了我们自己的比较逻辑
  //override  def compare(that: Person): Int = {
  def compare(that: Person): Int = {
    println("Person的compare被调用~~")
    this.age - that.age
  }

  //重写toString方法
  override def toString: String = {
    this.name + "\t" + this.age
  }
}
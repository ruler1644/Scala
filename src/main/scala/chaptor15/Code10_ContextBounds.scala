package chaptor15

//使用上下文界定(隐式值，隐式转换)，完成两个对象年龄大小的比较
//主要有三种方式
object Code10_ContextBounds {

  //方式一：隐式值
  implicit val personComparetor = new Ordering[Person10] {
    override def compare(p1: Person10, p2: Person10): Int = {
      p1.age - p2.age
    }
  }


  def main(args: Array[String]): Unit = {
    val p1 = new Person10("Tom", 10)
    val p2 = new Person10("Smith", 27)

    val res = new CompareComm5(p1, p2)
    println(res.greater)
  }
}


class Person10(val name: String, val age: Int) {

  //重写toString方法
  override def toString: String = {
    this.name + "\t" + this.age
  }
}

//方式一
//T是Ordering类型的泛型，trait Ordering[T] extends Comparator[T]
//隐式参数implicit comparator: Ordering[T]，由隐式值直接传入
class CompareComm5[T: Ordering](obj1: T, obj2: T)(implicit comparator: Ordering[T]) {

  def greater = {
    if (comparator.compare(obj1, obj2) > 0) obj1 else obj2
  }
}
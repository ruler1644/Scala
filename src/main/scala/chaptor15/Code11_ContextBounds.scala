package chaptor15

//使用上下文界定(隐式值，隐式转换)，完成两个对象年龄大小的比较
//主要有三种方式
object Code11_ContextBounds {

  //方式二：隐式值
  implicit val personComparetor = new Ordering[Person10] {
    override def compare(p1: Person10, p2: Person10): Int = {
      p1.age - p2.age
    }
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Person10("Tom", 10)
    val p2 = new Person10("Smith", 257)

    val res = new CompareComm6(p1, p2)
    println(res.greater)
  }
}

//方式二，将隐式参数放入方法内部
//隐式参数implicit comparator: Ordering[T]，由隐式值直接传入
class CompareComm6[T: Ordering](obj1: T, obj2: T) {

  def greater = {
    def f1(implicit comparator: Ordering[T]) = comparator.compare(obj1, obj2)

    if (f1 > 0) obj1 else obj2
  }
}
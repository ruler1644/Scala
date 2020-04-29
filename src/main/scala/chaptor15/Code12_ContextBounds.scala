package chaptor15

//使用上下文界定(隐式值，隐式转换)，完成两个对象年龄大小的比较
//主要有三种方式
object Code12_ContextBounds {

  //方式三：implicitly语法糖
  implicit val personComparetor = new Ordering[Person10] {
    override def compare(p1: Person10, p2: Person10): Int = {
      p1.age - p2.age
    }
  }


  def main(args: Array[String]): Unit = {
    val p1 = new Person10("Tom", 10)
    val p2 = new Person10("Smith", 245546)

    val res = new CompareComm7(p1, p2)
    println(res.greater)
  }
}

//方式三
class CompareComm7[T: Ordering](obj1: T, obj2: T) {

  def greater = {
    val comparator = implicitly[Ordering[T]]
    if (comparator.compare(obj1, obj2) > 0) obj1 else obj2
  }
}
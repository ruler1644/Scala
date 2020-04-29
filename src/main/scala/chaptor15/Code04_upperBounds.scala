package chaptor15

object Code04_upperBounds {
  def main1(args: Array[String]): Unit = {

    //传统的方法
    val res = new CompareInt(3, 1)
    println(res.greater)

    val res2 = new CompareFloat(1.4f, -3.14f)
    println(res2.greater)
  }

  def main(args: Array[String]): Unit = {

    //上界解决问题
    //设计子类型继承某个父类或实现某个接口时，在父类或者接口层面解决问题，通用性更好
    val res1 = new CompareComm(Integer.valueOf(3), Integer.valueOf(1))
    println(res1.greater)

    val res2 = new CompareComm(java.lang.Float.valueOf(1.4f), java.lang.Float.valueOf(-3.14f))
    println(res2.greater)

  }
}

//通用的泛型类，可以进行Int，Float等实现了Comparable接口的值直接的比较
class CompareComm[T <: Comparable[T]](obj1: T, obj2: T) {
  def greater = {
    if (obj1.compareTo(obj2) > 0) obj1 else obj2
  }
}

class CompareInt(n1: Int, n2: Int) {

  def greater = {
    if (n1 > n2) n1 else n2
  }
}


class CompareFloat(f1: Float, f2: Float) {

  def greater = {
    if (f1 > f2) f1 else f2
  }
}
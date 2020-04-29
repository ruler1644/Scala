package chaptor15

object Code07_ViewBounds {
  def main(args: Array[String]): Unit = {

    val res2 = new CompareComm2[java.lang.Float](1.4f, -3.14f)
    println(res2.greater)

    //视图界定，支持隐式转换
    //在Predef.scala类中查找相关的隐式转换
    // implicit def float2Float(x: Float): java.lang.Float = x.asInstanceOf[java.lang.Float]
    val res = new CompareComm2(44.3f, 9.5f)
    println(res.greater)

  }
}

// [T <% Comparable[T]]，表示T是Comparable[T]子类型，即T实现了Comparable接口
// 视图界定(<%)在上界(<:)的基础上，增加支持隐式转换的能力
// 表示Comparable的子类
// 可以进行Int，Float等实现了Comparable接口的值直接的比较
class CompareComm2[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = {
    if (obj1.compareTo(obj2) > 0) obj1 else obj2
  }
}

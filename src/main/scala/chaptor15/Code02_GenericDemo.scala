package chaptor15

import chaptor15.Season.Season

object Code02_GenericDemo {
  def main(args: Array[String]): Unit = {

    //使用泛型
    val class1 = new EnglishClass[Season, String, String](Season.Spring, "大数据", "就业班")
    println(class1.classSeason + class1.className + class1.ClassType)


    val class2 = new EnglishClass[Season, String, Int](Season.Summer, "大数据", 190408)
    println(class2.classSeason + class2.className + class2.ClassType)
  }

}


//scala枚举类型
//自定义枚举类，是Value类型，才可以使用。提供四个枚举类对象
object Season extends Enumeration {
  type Season = Value
  val Spring, Summer, Autumn, Winter = Value
}

//班级，三个泛型，季节，名称，类型
class EnglishClass[A, B, C](val classSeason: A, val className: B, val ClassType: C) {
}
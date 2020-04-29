package chaptor10

object Code04_ListTest {
  def main(args: Array[String]): Unit = {

    //空集合
    val list0 = Nil
    println(list0) //list()

    //package object scala中声明了类，所以创建时，直接分配元素apply
    val list1 = List("hello", 2, 3)
    println(list1) //List(hello, 2, 3)
    println(list1(0)) //hello

    //:+运算符,:前是集合 ,+后是元素,表示在列表的最后增加数据
    var list2 = list1 :+ 4
    println("list1=" + list1)
    println("list2=" + list2)

    var list3 = 1 +: list1
    println("list1=" + list1)
    println("list3=" + list3)

    val list4 = List(1, 2, 3, "abc")
    val list5 = 4 :: 5 :: 6 :: list4 :: Nil
    println(list5)
    //List(4, 5, 6, List(1, 2, 3, abc))

    var list6 = List(1, 2, 3, "abc")
    val list7 = 4 :: 5 :: 6 :: list6 ::: Nil
    println(list7)
    //List(4, 5, 6, 1, 2, 3, abc)
  }
}

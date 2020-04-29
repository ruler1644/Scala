package chaptor10

import scala.collection.mutable

object Code08_SetTest {
  def main(args: Array[String]): Unit = {

    //创建set
    val set1 = Set(1, 2, 4, "abc")
    println(set1)

    val set2 = mutable.Set(1, 2, 4, "abc")
    println(set2)

    //添加元素
    set2.add("haha")
    set2 += 66
    set2.+=(55)
    println(set2)

    //删除元素
    //如果删除的对象不存在，则不生效，也不会报错
    set2 -= 2
    set2 -= (55)
    set2.remove("abcd")
    println(set2)

    //遍历
    for (item <- set2) {
      print(item)
    }

  }
}

package chaptor13

//1)集合val list = List(1, 2, 3, 4, "abc") ，请完成如下要求:
//2)将集合list中的所有数字+1，并返回一个新的集合
//3)要求忽略掉非数字的元素，即返回的新的集合形式为(2, 3, 4, 5)

object Code01_PartialFun01 {
  def main(args: Array[String]): Unit = {

    //filter+map方式实现
    val list: List[Any] = List(1, 2, 3, 4, "abc")

    val list1: List[Any] = list.filter(myFilter)
    val list2: List[Int] = list1.map(myFMap)
    println(list2)

  }

  def myFMap(n: Any): Int = {
    //n.toString.toInt + 1
    n.asInstanceOf[Int] + 1
  }

  def myFilter(n: Any): Boolean = {
    n.isInstanceOf[Int]
  }

  def main1(args: Array[String]): Unit = {

    //模式匹配match方式实现
    val list: List[Any] = List(1, 2, 3, 4, "abc")

    val listMatch: List[Any] = list.map(myMatchMap)
    println(listMatch) //List(2, 3, 4, ())
  }

  def myMatchMap(item: Any) = {
    item match {
      case a: Int => a + 1
      case _ =>
    }
  }

}

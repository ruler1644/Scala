package chaptor13

//1)集合val list = List(1, 2, 3, 4, "abc") ，请完成如下要求:
//2)将集合list中的所有数字+1，并返回一个新的集合
//3)要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)
object Code02_PartialFun02 {
  def main1(args: Array[String]): Unit = {

    val list: List[Any] = List(1, 2, 3, 4, "abc")

    //map方法不支持偏函数, 因为map底层就是对集合的所有元素进行处理
    val list2: List[Int] = list.collect(myPartialFunction)
    println("list2 = " + list2) //list2 = List(2, 3, 4, 5)
  }

  //偏函数
  //首先调用isDefinedAt方法，判断传入的参数是否为Int型
  //isDefinedAt方法返回真，才会继续调用apply方法
  //isDefinedAt方法返回假，忽略数据
  val myPartialFunction = new PartialFunction[Any, Int] {

    override def isDefinedAt(x: Any): Boolean = {
      println("isDefinedAt被调用" + x)
      x.isInstanceOf[Int]
    }

    def apply(v1: Any): Int = {
      v1.asInstanceOf[Int] + 1
    }
  }

  def main2(args: Array[String]): Unit = {

    val list: List[Any] = List(1, 2, 3, "abc", 34L)

    //化简形式一
    def fun2: PartialFunction[Any, Int] = {
      case i: Int => i + 1
    }

    val list3: List[Int] = list.collect(fun2)
    println("list3 =" + list3)
  }

  def main(args: Array[String]): Unit = {

    val list: List[Any] = List(1, 2, 3, "abc", 34L)

    //化简形式二
    val list4: List[Int] = list.collect {
      case i: Int => i + 1
      case i: Long => i.toInt + 1
    }
    println(list4)
  }
}

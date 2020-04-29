package chaptor11.com

//使用scala模拟map实现机制
object Code04_Maptheroy {
  def main(args: Array[String]): Unit = {

    val list1 = MyList(1, 2, 4)
    val newList = list1.myMap(fun)
    println(newList)
  }

  //按规则运算的函数
  def fun(num: Int): Int = {
    num * 2
  }
}

class MyList(n1: Int, n2: Int, n3: Int) {

  var list1 = List(n1, n2, n3)
  var list2 = List[Int]()

  //高阶函数myMap,接收函数fun:(Int) => Int
  def myMap(fun: Int => Int): List[Int] = {

    //遍历list1,每取出一个元素，就传递给fun运算
    //将每次得到结果，放入到新的集合list2中
    for (item <- list1) {
      list2 = list2 :+ fun(item)
    }
    list2
  }
}

//伴生对象定义apply方法
object MyList {
  def apply(n1: Int, n2: Int, n3: Int): MyList = new MyList(n1, n2, n3)
}
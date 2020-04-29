package chaptor13

object Code03_NoNameFunction {
  def main(args: Array[String]): Unit = {

    //匿名函数
    val list2: List[Int] = List(1, 4, 7).map((x) => (x * 2))
    println(list2) //List(2, 8, 14)


    //高阶函数返回匿名函数
    //返回的函数引用到了外界传入的参数x，将此匿名函数称为闭包
    def gaoFunction(x: Int) = {
      y: Int => x - y
    }

    println(gaoFunction(10)) //<function1>====>10 - y
    println(gaoFunction(10)(8)) //2====>

    //从复杂到简单
    List(1, 2, 3, 4).map((num: Int) => {
      num + 1
    })
    List(1, 2, 3, 4).map((num) => {
      num + 1
    })
    List(1, 2, 3, 4).map((num) => num + 1)
    List(1, 2, 3, 4).map(_ + 1)

    //从简单到复杂
    List(1, 2, 3, 4).reduce(_ + _)
    List(1, 2, 3, 4).reduce((x, y) => x + y)
    List(1, 2, 3, 4).reduce((x: Int, y: Int) => { x + y })


  }
}

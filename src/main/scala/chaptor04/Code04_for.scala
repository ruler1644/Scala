package chaptor04

//for推导式
object Code04_for {
  def main(args: Array[String]): Unit = {

    //for循环yield返回值
    val res = for (i <- 1 to 10) yield {
      i * 2
    }
    print(res)

    //用大括号{}代替小括号()
    for {i <- 1 to 3
         j = i * 2} {
      println(" i= " + i + " j= " + j)
    }

    //循环守卫方式实现continue效果
    var count = 0
    var sum = 0
    for {i <- 1 to 100 if i % 9 == 0} {
      count += 1
      sum += i
    }
    println(" count= " + count + " sum= " + sum)
  }
}
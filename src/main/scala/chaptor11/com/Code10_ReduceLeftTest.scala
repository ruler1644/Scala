package chaptor11.com

//计算List(1, 20, 30, 4, 5)各元素之和
/**
  * def reduceLeft[B >: A](@deprecatedName('f) op: (B, A) => B): B =
  */
object Code10_ReduceLeftTest {
  def main(args: Array[String]): Unit = {

    var list = List(1, 20, 30, 4, 5)

    //reduce和reduceLeft等价
    //sum(sum(sum(sum(1 + 20 ) + 30) + 4) + 5) = 60
    val result = list.reduce(sum)
    println(result)

    var res1 = list.reduceRight(sum)
    println("res = " + res1)

    //var res2 = list.reduceLeft(min)
    val res2 = list.reduce(min)
    println("res2 = " + res2)


    //化简方式求差值
    val list2 = List(1, 2, 3, 4, 5)
    println(list2.reduceLeft(minus)) //-13
    println(list2.reduceRight(minus)) //3
  }

  //两数字之和
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  //两个数字较小的
  def min(n1: Int, n2: Int): Int = {
    if (n1 > n2) n2 else n1
  }

  //两个数字之差
  def minus(n1: Int, n2: Int): Int = {
    n1 - n2
  }

}

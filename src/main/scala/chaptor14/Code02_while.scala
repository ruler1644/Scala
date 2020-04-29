package chaptor14

import java.util.Date

object Code02_while {
  def main(args: Array[String]): Unit = {

    val start = new Date()


    //循环方式---->8135
    var res = BigInt(0)
    var num = BigInt(1)
    val numMax = BigInt(99999999L)
    //    while (num < numMax) {
    //      res += num
    //      num += 1
    //    }

    //递归方式----->8767
    mySum(num, res)

    val end = new Date()
    println(end.getTime - start.getTime)
  }


  def mySum(num: BigInt, sum: BigInt): BigInt = {

    //将本次计算得到的sum+num，传递给下一次递归的sum使用(尾递归)，不会重复计算
    if (num <= 999999L)
       mySum(num + 1, sum + num)
    else
       sum
  }
}

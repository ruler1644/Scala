package homework

object Work1 {
  def main1(args: Array[String]): Unit = {

    //1.   数字开方再平方
    var num1 = Math.sqrt(2)
    println(num1)

    var num2 = Math.pow(num1, 2)
    println(num2)

    //2.   字符串倍数
    //     crazy.$times(3)
    var string = "crazy" * 3
    println(string)

    //3.   返回两数字中较大者
    var num3 = 10 max 20
    println(num3)

    //4.   2的1024次方
    var num4 = BigInt(2).pow(1024)
    print(num4)
  }

  def main(args: Array[String]): Unit = {
    //5.  截取首尾字符
    var str = "Hello"

    var str21 = str.charAt(0)
    println("str21 = " + str21)
    var str22 = str.charAt(str.length - 1)
    println("str22 = " + str22)

    var str31 = str.head
    println("str31 = " + str31)
    var str32 = str.last
    println("str32 = " + str32)

    var str41 = str.take(1)
    println("str41 = " + str41)
    var str42 = str.takeRight(1)
    println("str42 = " + str42)
  }
}

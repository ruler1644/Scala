package homework

import scala.io.StdIn

object Work3 {

  //1计算数字的signum
  def signum(num: Int) = {
    if (num > 0) {
      printf("signum %d > 1", num)
    } else if (num == 0) {
      printf("signum %d = 1", num)
    } else {
      printf("signum %d < 1", num)
    }
  }

  //2块表达式{}，返回Unit类型，值为()
  def test(): Unit = {
    var res = {}
    println(res)
  }

  //3 反转输出
  //4 打印从n到0的数字
  //  对Range集合进行反转输出
  def reverse(n: Int): Unit = {
    //    for (i <- 0 to 10;j=10-i){
    //      println(j)
    //    }
    for (i <- 0 to n reverse) {
      print(i + "\t")
    }

    (10 to 20).reverse.foreach(println)
  }

  //5字符串中所有字母的Unicode码的乘积
  //7 函数方式
  //"Hello"本质是char数组
  def multiply(): Unit = {
    var res = 1L
    for (i <- "Hello") {
      res = res * i.toLong
    }
    print("\n" + res)
  }

  //6 forEach方法
  def multiplyForEach(str: String): Unit = {
    var res = 1L
    str.foreach((ch: Char) => {
      res *= ch.toLong
    })
    println(res)
  }

  //8 递归方式
  def recurse(str: String): Long = {
    if (str.length == 1) {
      str.charAt(0).toLong;
    } else {
      str.take(1).charAt(0).toLong * recurse(str.drop(1))
    }
  }

  //9 递归分段函数
  def recurseFun(x: Int, n: Int): Double = {
    if (n == 0) {
      //Math.pow(x,n)
      1
    } else if (n < 0) {
      1.0 / x * recurseFun(x, n + 1)
    }
    else {
      x * recurseFun(x, n - 1)
    }
  }

  def main(args: Array[String]): Unit = {

    /*print("请输入一个整数：")
    var num = StdIn.readByte()
    signum(num)*/

    //test

    //reverse(10)
    multiply()
    //multiplyForEach("Hello")
    //print(recurse("Hello"))
    // print(recurseFun(2, -2))
  }

}

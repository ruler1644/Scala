package homework

import scala.io.StdIn
import util.control.Breaks._

object Work2 {

  //1.双层for循环
  def main1(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 2

    var classTotalScore = 0.0
    var totalScore = 0.0
    var stuScore = 0.0
    var stuSize = 0

    for (i <- 1 to classNum) {
      classTotalScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入%d班%d号学生成绩：", i, j)
        stuScore = StdIn.readDouble()
        if (stuScore > 60) {
          stuSize += 1;
        }
        classTotalScore += stuScore
        totalScore += stuScore
      }
      print("班级平均分为：" + (classTotalScore / stuNum) + "\n")
    }
    println("所有学生平均分为：" + (totalScore / (classNum * stuNum)))
    println("所有学生中及格人数为：" + stuSize)
  }

  //2.九九乘法表
  def main2(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(i + "*" + j + "=" + (i * j) + "\t")
      }
      println()
    }

    println("嵌套循环方式")
    for (i <- 1 to 9; j <- 1 to i) {
      print(i + "*" + j + "=" + (i * j) + "\t")
      if (i == j) {
        println()
      }
    }
  }

  //3.break()循环中断
  def main3(args: Array[String]): Unit = {
    var sum1 = 0
    var current1 = 0
    breakable {
      for (i <- 1 to 100) {
        sum1 += i
        if (sum1 > 20) {
          current1 = i
          break()
        }
        println("i = " + i)
      }
    }
    println("i1 = " + current1)
    println("********")

    //循环守卫方式实现循环中断
    var sum2 = 0
    var current2 = 0
    var flag = true
    for (i <- 1 to 100 if flag) {
      sum2 += i
      if (sum2 > 20) {
        current2 = i
        flag = false
      }
      println("i = " + i)
    }
    println("i2 = " + current2)
  }

  //4.登陆次数验证
  def main4(args: Array[String]): Unit = {
    var uname = ""
    var pwd = ""
    var num = 3
    breakable {
      for (i <- 1 to num) {
        print("请输入用户名：")
        uname = StdIn.readLine()
        print("请输入账号密码：")
        pwd = StdIn.readLine()
        if ("aaa".equalsIgnoreCase(uname) && "666".equals(pwd)) {
          print("登陆成功")
          break()
        } else {
          if ((num - i) > 0) {
            print("账号或密码错误，请重新输入！")
            printf("您还有%d次机会\n", (num - i))
          }
        }
      }
    }
  }

  //5.过路口
  def main(args: Array[String]): Unit = {
    var balance: Double = 100000
    var count = 0

    while (balance > 50000) {
      balance = balance * 0.95
      count += 1
    }
    println("count = " + count)
    println("balance = " + balance)

    while (balance > 1000) {
      balance -= 1000
      count += 1
    }
    println("count = " + count)
    println("balance = " + balance)
  }
}

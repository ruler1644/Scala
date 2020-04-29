package chaptor04

import scala.io.StdIn

//嵌套分支的用法
object Code02_if_else {
  def main(args: Array[String]): Unit = {
    print("请输入月份：")
    var month = StdIn.readInt()
    print("请输入年龄：")
    var year = StdIn.readInt()
    var ticket: Double = 60

    if (month >= 4 && month <= 10) {
      print("旺季")
      if (year >= 18 && year <= 60) {
        print(ticket)
      } else if (year < 18) {
        print(ticket / 2)
      } else {
        print(ticket / 3)
      }
    } else {
      print("淡季")
      if (year >= 18 && year <= 60) {
        print(ticket)
      } else {
        print(ticket / 3)
      }
    }
  }
}

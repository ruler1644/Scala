package chaptor04

import scala.io.StdIn

//if分支的用法
object Code01_if {
  def main(args: Array[String]): Unit = {
    print("请输入年份：")
    var year = StdIn.readInt()
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
      printf("%d是闰年", year)
    } else {
      printf("%d不是闰年", year)
    }
  }

}

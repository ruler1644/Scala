package chaptor13

//比较两个字符串在忽略大小写的情况下是否形同
//1.转换
//2.比较
object Code07_CurryDemo {
  def main(args: Array[String]): Unit = {

    println("xiAO".checkEq("XIao")(eq))

    //简化形式
    println("xiAO".checkEq("XIao")(_.equals(_)))

    //隐式类
    //提供checkEq方法，当一个字符串使用了checkEq方法，就会发生隐式转换
    //checkEq将字符串的比较，看成两个步骤
    implicit class TestEq(str1: String) {
      def checkEq(str2: String)(fun: (String, String) => Boolean) = {
        fun(str1.toUpperCase, str2.toUpperCase)
      }
    }
  }

  //隐式类的形式
  def eq(str1: String, str2: String) = {
    str1.equals(str2)
  }
}

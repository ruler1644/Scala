package chaptor13

//比较两个字符串在忽略大小写的情况下是否形同
//1.转换
//2.比较
object Code06_CurryDemo {
  def main(args: Array[String]): Unit = {

    val res1: Boolean = CurryFunction("xiAO")("XIao")
    println(res1)
  }

  //常规形式
  def CurryFunction(str1: String)(str2: String) = {
    str1.toUpperCase.equals(str2.toUpperCase)
  }
}

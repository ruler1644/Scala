package chaptor01

//scala三种输出方式
object Code02_Output {
  def main(args: Array[String]): Unit = {
    val name = "ApacheCN"
    val age = 1
    val sal = 2345678.989
    val url = "www.atguigu.com"

    //1java方式
    println("name=" + name)

    //2c语言方式
    printf("name=%s age=%d sal=%.2f\n", name, age, sal)

    //3PHP方式
    println(s"name=$name sal=$sal sum=${sum(20, 30)}")
  }

  //scala中的文档注释
  /** @param num1 第一个参数
    * @param num2 第二个参数
    * @return 返回两个参数之差
    */
  def sum(num1: Int, num2: Int): Int = {
    return num1 + num2
  }

}

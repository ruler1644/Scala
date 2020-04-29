package chaptor13

object Code04_ClosureDemo {
  def main(args: Array[String]): Unit = {

    val ClosureFunction = makeSuffix(".jpg")
    println(ClosureFunction("小强")) //小强.jpg
    println(ClosureFunction("猫猫.jpg")) //猫猫.jpg
  }

  //匿名函数String=>String，使用suffix外部变量，构成闭包
  def makeSuffix(suffix: String) = {
    (fileName: String) => {
      if (fileName.endsWith(suffix)) fileName
      else fileName + suffix
    }
  }
}
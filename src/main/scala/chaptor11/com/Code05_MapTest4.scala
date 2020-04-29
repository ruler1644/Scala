package chaptor11.com

//val names = List("Alice", "Bob", "Nick") 中的所有单词，
//全部转成字母大写，返回到新的List集合中
object MapTest4 {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick")
    val myList = names.map(toUpper)
    println(myList)
  }

  def toUpper(str: String): String = {
    str.toUpperCase()
  }
}

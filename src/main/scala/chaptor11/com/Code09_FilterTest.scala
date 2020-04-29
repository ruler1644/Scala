package chaptor11.com

//val names = List("Alice", "Bob", "Nick") 集合中首字母为'A'的筛选到新的集合
object Code09_FilterTest {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick")
    val list: List[String] = names.filter(isStartWith)
    println(list)
  }

  def isStartWith(str:String):Boolean={
    str.startsWith("A")
  }
}

package chaptor11.com

object Code07_FlatMapTest {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick")
    val list: List[Char] = names.flatMap(myFlatMap)
    println(list)
  }

  def myFlatMap(str: String): String = {
    str.toUpperCase()
  }
}

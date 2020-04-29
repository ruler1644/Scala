package chaptor11.com

//手动实现flatMap
object Code08_FlatMapTheroy {
  def main(args: Array[String]): Unit = {

    val myList = new MyList02("Alice", "Bob", "Nick")
    val list: List[Char] = myList.MyFlatMap(toUpper)
    println(list)
  }

  def toUpper(str: String): String = {
    str.toUpperCase()
  }
}

class MyList02(s1: String, s2: String, s3: String) {

  val names = List(s1, s2, s3)
  var list2 = List[Char]()

  def MyFlatMap(fun: String => String): List[Char] = {
    for (item <- names) {
      val str = fun(item)

      //对str扁平化
      for (j <- str) {
        list2 = list2 :+ j
      }
    }
    list2
  }
}
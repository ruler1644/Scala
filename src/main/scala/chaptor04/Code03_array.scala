package chaptor04

//遍历Array
object Code03_array {
  def main(args: Array[String]): Unit = {
    var arr = Array(10, 20, 30);
    for (item <- arr) {
      println("item =" + item)
    }
  }
}

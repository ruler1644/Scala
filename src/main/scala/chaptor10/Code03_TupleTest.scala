package chaptor10

object Code03_TupleTest {
  def main(args: Array[String]): Unit = {

    val tuple = (("hehe", 5), 23, "hello")

    //访问元组元素
    println(tuple._1._1)
    println(tuple.productElement(0))

    for (i <- tuple.productIterator) {
      println("i = " + i)
    }
  }
}

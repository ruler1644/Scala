package chaptor12.comm

abstract class Item

case class Book(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, item: Item*) extends Item

object BookDemo {
  def main(args: Array[String]): Unit = {

    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("<阳关>", 80), Book("<围城>", 30)))


    println("-111111111111-")
    val res = sale match {

      //如果我们进行对象匹配时，不想接受某些值，则使用 _ 忽略即可，_* 忽略表示所有
      //case Bundle(_, _, Book(desc, _), _*) => desc //漫画
      case Bundle(_, _, Book(desc1, _), Bundle(_, _, Book(desc2, _), Book(desc3, _))) => desc1 + desc2 + desc3 //漫画<阳关><围城>
    }
    println(res)


    println("*2222222222222222*")
    //通过@将嵌套的值绑定到变量。_*绑定剩余Item到rest
    val result2 = sale match {
      case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
    }
    println("art = " + result2._1)
    println("rest= " + result2._2)


    println("*3333333333333333*")
    val result3 = sale match {

      //说明因为没有使用 _* 即明确说明没有多个Bundle,所以返回的rest，就不是WrappedArray了。
      case Bundle(_, _, art@Book(_, _), rest) => (art, rest)
    }
    println("art = " + result3._1)
    println("rest = " + result3._2)

  }
}

package chaptor12.comm

object Code05_BookDemo2 {
  def main(args: Array[String]): Unit = {

    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("<阳关>", 80), Book("<围城>", 30)))

    val money: Double = sale match {
      case Bundle(_, reduce1, Book(_, add1), Bundle(_, reduce2, Book(_, add2), Book(_, add3))) => {
        add1 + add2 + add3 - (reduce1 + reduce2)
      }
    }
    println(money)


    def price(item: Item): Double = {
      item match {

        //如果是书返回价格
        case Book(_, d) => d
        case Bundle(_, discount, rest@_*) => {
          rest.map(price).sum - discount
        }
      }
    }

    println(price(sale))
  }
}

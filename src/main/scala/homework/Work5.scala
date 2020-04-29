package homework

object Work5 extends App {

  //第一题，apply方法的应用
  val point1 = Point()
  println(point1.show())

  val point2 = Point(y = 4)
  println(point2.show())

  val point3 = Point(3, 4)
  println(point3.show())


  //第二题，reverse，mkString方法将数组转成字符串输出
  println(args.reverse.mkString(","))

  //第三题，Enumeration用法
  private val heart: Suit.Value = Suit.Heart
  println(heart)
  println(Suit)

}


class Point(x1: Int, x2: Int) {
  var x: Int = x1
  var y: Int = x2

  def show() = {
    s"x = $x,y = $y"
  }
}

object Point {
  def apply(x: Int = 1, y: Int = 0) = {
    new Point(x, y)
  }
}

object Suit extends Enumeration {

  //定义枚举值
  //protected final def Value(name: String): Value = Value(nextId, name)
  val Spade = Value("♠")
  val Heart = Value("♥")
  val Club = Value("♣")
  val Diamond = Value("♦")

  override def toString(): String = {
    val valueSet: Suit.ValueSet = Suit.values
    valueSet.mkString(",")
  }
}
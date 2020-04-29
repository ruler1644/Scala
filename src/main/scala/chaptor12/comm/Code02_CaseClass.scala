package chaptor12.comm

object CaseClass {
  def main1(args: Array[String]): Unit = {

    //这里我们体现出样例的对象构建和对象提取，在对象匹配的结合使用
    for (amt <- Array(Dollar(1100.0), Currency(200000.0, "JAP"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }
  }

  def main(args: Array[String]): Unit = {

    //copy创建一个与现有对象值相同的新对象，并可以通过带名参数来修改某些属性
    val dollar = new Dollar(900)
    val dollar2 = dollar.copy(value = 900)

    println("hashCode = " + dollar.hashCode())
    println(System.identityHashCode(dollar))
    println("------------")

    println("hashCode = " + dollar2.hashCode())
    println(System.identityHashCode(dollar2))

    println("------------")
    println(dollar.value)
    println(dollar2.value)


    val currency = Currency(200000.0, "RMB")
    val currency2 = currency.copy(value = 99999.9, unit = "$")
    println(currency2.value + "---->" + currency2.unit)
  }
}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount

class Dog(name: String)
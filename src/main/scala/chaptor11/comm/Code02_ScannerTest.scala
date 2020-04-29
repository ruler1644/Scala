package chaptor11.comm

object Code02_ScannerTest {
  def main(args: Array[String]): Unit = {

    def minus( num1 : Int, num2 : Int ) : Int = {
      num1 - num2
      //num1 + num2
    }

    val list: IndexedSeq[Int] = (1 to 5).scanLeft(5)(minus)
    println(list)

    val i10 = (1 to 5).scanRight(5)(minus)
    println(i10)
  }
}

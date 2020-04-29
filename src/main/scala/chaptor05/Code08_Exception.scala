package chaptor05

//scala的异常处理
object Code08_Exception {
  def main(args: Array[String]): Unit = {
    try {
      var n1 = 0
      var n2 = 10
      var res = n2 / n1
      print(res)
    } catch {
      case ex: ArithmeticException => {
        println(ex.getMessage)
      }
    }
    finally {
      println("go on...")
    }
  }
}

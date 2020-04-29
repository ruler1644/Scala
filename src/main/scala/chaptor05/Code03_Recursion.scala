package chaptor05

//递归的案例
object Code03_Recursion {
  def main(args: Array[String]): Unit = {
    recurse1(4)
    recurse2(4)
  }

  def recurse1(n: Int) {
    if (n > 2) {
      recurse1(n - 1)
    }
    println("n1111111 = " + n)
  }

  def recurse2(n: Int) {
    if (n > 2) {
      recurse2(n - 1)
    } else {
      println("n=" + n)
    }
  }
}

package chaptor11.comm

object Code07_StreamTest {
  def main(args: Array[String]): Unit = {

    val stream: Stream[BigInt] = numsForm(1)

    //取出元素
    println(stream) //Stream(1, ?)
    println(stream.head) //1

    //再生成一个元素
    println(stream.tail) //Stream(2, ?)
    println(stream) //Stream(1, 2, ?)

  }

  //numsForm方法返回一个Stream[BigInt]流，返回规则是n + 1
  def numsForm(n: BigInt): Stream[BigInt] = {
    n #:: numsForm(n + 1)
  }
}

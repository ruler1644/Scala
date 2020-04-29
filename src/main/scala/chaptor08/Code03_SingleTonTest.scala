package chaptor08

object Code03_SingleTonTest {
  def main(args: Array[String]): Unit = {
    var ton1 = SingleTon2.getInstance
    var ton2 = SingleTon2.getInstance
    println(ton1)
    println(ton2)
  }
}

//1.饿汉式单例
object SingleTon1 {
  private val instance: SingleTon1 = new SingleTon1()
  def getInstance = {
    instance
  }
}
class SingleTon1 private() {
}


//2.懒汉式单例
object SingleTon2 {
  private var instance: SingleTon2 = null

  def getInstance = {
    if (instance == null) {
      instance = new SingleTon2()
    }
    instance
  }
}

class SingleTon2 private() {
}
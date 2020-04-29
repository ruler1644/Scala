package chaptor05

object Code06_FunctionDetails {
  def main(args: Array[String]): Unit = {

    //给形参设定默认值
    sayHi()
    sayHi("jack")
    println("***********")

    //使用带名参数
    //getConnectin("127.0.0.1", "root")
    getConnectin("127.0.0.1", pwd = "haha")
  }

  def sayHi(name: String = "tom"): Unit = {
    println("Hi:" + name)
  }


  def getConnectin(host: String = "local", port: Int = 3306,
                   user: String = "root", pwd: String): Unit = {
    println("host = " + host)
    println("port = " + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }
}

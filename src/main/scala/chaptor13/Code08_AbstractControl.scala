package chaptor13

object Code08_AbstractControl {
  def main1(args: Array[String]): Unit = {
    //    var i = 10
    //    breakable {
    //      while (i < 20) {
    //        i += 1
    //        if (i == 18)
    //        break()
    //      }
    //    }
    //    println(i)

    myRunInThred { () =>
      println("干活了，5秒完成")
      Thread.sleep(1000)
      printf("干完了")
    }


    //传统方式,接收匿名函数,格式f1: () => Unit
    def myRunInThred(f1: () => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }
  }

  def main(args: Array[String]): Unit = {

    //控制抽象
    myRunInThred2 {
      println("干活了，5秒完成")
      Thread.sleep(1000)
      printf("干完了")
    }

    //函数空参，将小括号省略，run方法中也省略，使用时也省略
    def myRunInThred2(f1: => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }
  }

}
package chaptor07.atguigu

object TestVisit {
  def main(args: Array[String]): Unit = {
    val clerk = new Clerk

    //private属性只能本类访问，外部无法访问
    //clerk.salary

    //protected属性只能本类访问，外部无法访问，底层编译器层面控制
    //clerk.job

    //默认权限
    println(clerk.name)

    //伴生对象可以访问伴生类全部属性和方法
    Clerk.getInfo(clerk)
  }
}

//伴生类
class Clerk {

  //默认的访问修饰符，私有属性,两个public的name_$eq和name方法
  var name: String = "tom"

  //私有属性,两个private方法,编译器层面控制,本类,伴生对象可用
  private val salary: Double = 32400.5

  //私有属性,两个public 方法,编译器层面控制,本类,伴生对象,子类用
  protected var job: String = "大数据工程师"

  //方法，默认修饰符是public，public 访问权限
  def public_show() = {
    println(s"name = $name,job = $job,salary =$salary")
  }

  // public 访问权限
  protected def protected_show() = {
    println(s"name = $name,job = $job,salary =$salary")
  }

  // private访问权限
  private def private_show() = {
    println(s"name = $name,job = $job,salary =$salary")
  }
}

//伴生对象，可以访问到伴生类的任何属性和方法
object Clerk {

  def getInfo(clerk: Clerk) = {
    printf(s"info:${clerk.name},${clerk.job},${clerk.salary}")
  }

  private def fun1() = {
    print("fun1")
  }

  protected def fun2() = {
    print("fun2")
    666
  }
}
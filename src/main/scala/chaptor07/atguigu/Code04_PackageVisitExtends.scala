package chaptor07 {

  object hahaha {
    def main(args: Array[String]): Unit = {

      import chaptor07.atguigu.Person
      val person = new Person

      //chaptor07包不能访问name
      //person.name

      //chaptor07包可以访问love
      person.love
    }
  }

  package atguigu {

    object PackageVisitExtends {
      def main(args: Array[String]): Unit = {
        val person = new Person

        //atguigu包下可以访问name
        person.name

        //chaptor07包的子包可以访问love
        person.love
      }
    }

    class Person {

      //私有属性原本只能在本类，伴生对象中直接访问，但通过包的访问权限的扩展，可以在atguigu包下访问
      private[atguigu] var name: String = "小强"

      //protected属性原本只能在本类，子类，伴生对象中直接访问，但通过包的访问权限的扩展，可以在chaptor07和它的子包下访问
      protected[chaptor07] val love: String = "mylove"
    }

  }

}
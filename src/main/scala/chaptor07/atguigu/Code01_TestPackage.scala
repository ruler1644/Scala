package chaptor07.atguigu{
  object TestPackage2{
    def main(args: Array[String]): Unit = {

      //父包要访问子包，import相应内容
      import chaptor07.atguigu.scala.Hero
      val hero = new Hero()
      print(hero)
    }
  }
  class User
  class Sheep

  package scala{
    object TestPackage {
      def main(args: Array[String]): Unit = {

        //子包可以直接访问父包
        val sheep1 = new Sheep
        println(sheep1)

        //子父包都有，就近原则
        val user1 = new User
        println(user1)

        //指定访问父包
        val user2 = new chaptor07.atguigu.User
        println(user2)
      }
    }
    class User
    class Hero
  }
}
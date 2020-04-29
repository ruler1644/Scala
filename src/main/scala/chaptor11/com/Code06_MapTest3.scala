package chaptor11.com

import scala.collection.mutable

object Code06_MapTest3 {
  def main1(args: Array[String]): Unit = {

    val map = Map("北京" -> 42, "上海" -> 43, "深圳" -> 44)

    //不可变的map,不能 +=，
    //可以+,表示添加新的或修改旧的key的value,返回一个新的map
    //map += ("深圳" -> 55)
    val map2 = map + ("深圳111" -> 55)
    val map3 = map + ("深圳" -> 55)
    println(map)
    println(map2)
    println(map3)
  }


  // 可变的map,
  // 可以+=，表示添加新的或修改旧的value
  // 可以+，表示添加新的或修改旧的value,返回一个新的map
  def main(args: Array[String]): Unit = {

    var map1 = mutable.Map("北京" -> 42, "上海" -> 43, "深圳" -> 44)

    map1 = map1 + ("深圳" -> 5225)
    println(map1)

    map1 += ("深圳dd" -> 55)
    println(map1)

  }
}

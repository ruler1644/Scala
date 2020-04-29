package homework

//WordCount
object Work8 {
  def main1(args: Array[String]): Unit = {
    val lines = List("spark world", "world count", "spark world")

    //flatMap
    val res1: List[String] = lines.flatMap((str: String) => str.split(" "))
    println(res1) //List(spark, world, world, count, spark, world)

    //map
    val res2: List[(String, Int)] = res1.map((str: String) => (str, 1))
    println(res2) //List((spark,1), (world,1), (world,1), (count,1), (spark,1), (world,1))

    //groupBy
    val res3: Map[String, List[(String, Int)]] = res2.groupBy((tuple: (String, Int)) => tuple._1)
    println(res3) //Map(count -> List((count,1)), spark -> List((spark,1), (spark,1)), world -> List((world,1), (world,1), (world,1)))

    //map
    val res4: Map[String, Int] = res3.map((tup: (String, List[(String, Int)])) => (tup._1, tup._2.size))
    println(res4) //Map(count -> 1, spark -> 2, world -> 3)

    //sortBy
    val res5: List[(String, Int)] = res4.toList.sortBy((kv: (String, Int)) => (kv._2)).reverse
    println(res5) //List((world,3), (spark,2), (count,1))
  }

  def main2(args: Array[String]): Unit = {
    val lines = List("spark world", "world count", "spark world")

    val res = lines
      .flatMap((str: String) => str.split(" "))
      .map((str: String) => (str, 1))
      .groupBy((tuple: (String, Int)) => tuple._1)
      .map((tup: (String, List[(String, Int)])) => (tup._1, tup._2.size))
      .toList.sortBy((kv: (String, Int)) => (kv._2)).reverse

    println(res) //List((world,3), (spark,2), (count,1))
  }

  def main(args: Array[String]): Unit = {
    val lines = List("spark world", "world count", "spark world")

    val res = lines
      .flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(_._1)
      .map(tup => (tup._1, tup._2.size))
      .toList.sortBy(_._2)//.reverse

    println(res) //List((world,3), (spark,2), (count,1))
  }
}

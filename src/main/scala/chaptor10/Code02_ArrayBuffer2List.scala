package com.atguigu.chapter10

import java.util

import scala.collection.mutable.ArrayBuffer

// Scala集合和Java集合互相转换
object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {

    val arr = ArrayBuffer("1", "2", "3")

    //这里的bufferAsJavaList是一个隐式函数
    import scala.collection.JavaConversions.bufferAsJavaList

    /*
    implicit def bufferAsJavaList[A](b : scala.collection.mutable.Buffer[A]) : java.util.List[
     */
    val javaArr = new ProcessBuilder(arr)
    val arrList: util.List[String] = javaArr.command()
    println(arrList) //输出 [1, 2, 3]

    // asScalaBuffer 是一个隐式转换函数
    //implicit def asScalaBuffer[A]
    // java.util.List[A])
    // scala.collection.mutable.Buffer[A]

    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable

    val scalaArr: mutable.Buffer[String] = arrList
    scalaArr.append("jack")
    println(scalaArr) //ArrayBuffer(1, 2, 3, jack)

  }
}

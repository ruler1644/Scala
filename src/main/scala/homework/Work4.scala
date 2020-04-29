package homework

import scala.beans.BeanProperty

object work4 {
  def main(args: Array[String]): Unit = {
    val time1 = new Time(10, 22)
    val time2 = new Time(11, 22)
    print(time1.before(time2))

  }
}

class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    if (hours < other.hours || (hours == other.hours && minutes < other.minutes)) {
      true
    } else {
      false
    }
  }
}

class Student {
  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}
package com.wsyt.base.scala.func

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description 强制转换方法为函数
  *
  */
object ForceCastTest extends App {

  //case类可类比java中的Enum类
  case class WeeklyWeatherForceCast(temperatures : Seq[Double]) {
    //自动类型推断
    private def convertCtoF(temp: Double) = temp * 1.8 + 32

    //可以传入一个对象方法作为高阶函数的参数,因为Scala编译器会将方法强制转换为一个函数
    //方法convertCtoF被传入forceCastInFahrenheit,这是被允许的,因为编译器强制将方法convertCtoF转换成函数x => convertCtoF(x)
    def forceCastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
  }

  val temp = WeeklyWeatherForceCast(List(11.2,12.1,15.6,21.4))
  temp.forceCastInFahrenheit foreach println
}

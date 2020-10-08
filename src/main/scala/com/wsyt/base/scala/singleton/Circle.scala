package com.wsyt.base.scala.singleton

import math._

/**
  *
  * @author xzwang
  * @date 2020-09-21
  * @title
  * @description 伴生对象
  *
  */
case class Circle(radius: Double) {


  def area: Double = Circle.calculateArea(radius)

}

object Circle {

  //不可被外部所调用
  //单例对象object Circle包含一个方法calculateArea,它在每个实例化对象中都是可见的
  private def calculateArea(radius: Double) = Pi * pow(radius,2)


  def main(args: Array[String]): Unit = {
    val circle = Circle(5.0)
    println(circle.area)
  }

}

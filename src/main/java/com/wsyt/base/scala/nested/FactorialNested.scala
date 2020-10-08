package com.wsyt.base.scala.nested

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description 支持嵌套方法
  *
  */
object FactorialNested extends App {

  def factorial(x: Int): Int = {
    def fact(x: Int,accumulator:Int):Int = {
      if (x <= 2) accumulator
      else fact(x - 1,x * accumulator)
    }
    fact(x,1)
  }


  println(factorial(2))
  println(factorial(3))
  println(factorial(5))

}

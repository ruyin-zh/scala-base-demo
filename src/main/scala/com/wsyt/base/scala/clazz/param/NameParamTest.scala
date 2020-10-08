package com.wsyt.base.scala.clazz.param

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 传名参数
  * @description 传名参数仅在被使用时触发实际参数的求值运算,这与传值参数正好相反;
  *              要将一个参数变为传名参数,只需在它的类型前加上 =>
  *
  *              传名参数的优点(懒加载?):
  *              1、若参数在函数体中未被使用,则不会对它们进行求值;
  *              2、传值参数仅被计算一次;
  *
  */
object NameParamTest {

  def calculate(input: => Int) = input * 37

  def whileLoop(condition: => Boolean)(body: => Unit): Unit ={
    if (condition){
      body
      whileLoop(condition)(body)
    }
  }

  def main(args: Array[String]): Unit = {

    println(calculate(2))

    var i = 2
    whileLoop(i > 0){
      println(i)
      i -= 1
    }

  }

}

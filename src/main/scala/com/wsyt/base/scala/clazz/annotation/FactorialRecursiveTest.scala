package com.wsyt.base.scala.clazz.annotation

import scala.annotation.tailrec

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 注解
  * @description
  *
  */
object FactorialRecursiveTest {

  //尾递归操作
  def factorial1(x: Int): Int = {

    @tailrec
    def factorialHelper(x: Int,accumulator: Int): Int = {
      if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
    }

    factorialHelper(x,1)
  }


  //递归操作
  def factorial2(x:Int): Int = {

    //@tailrec注解确保方法确实是尾递归,如若不然则编译报错
    //@inline
    def factorialHelper(x: Int): Int={
      if (x == 1) 1 else x * factorialHelper(x - 1)
    }
    factorialHelper(x)
  }

  def main(args: Array[String]): Unit = {
    println(factorial1(10))
    println(factorial2(10))
  }

}

package com.wsyt.base.scala.generic

/**
  *
  * @author ruyin_zh
  * @date 2020-09-27
  * @title
  * @description
  *
  */
abstract class Fruit

class Apple extends Fruit
class Banana extends Fruit

object Fruit {

  def main(args: Array[String]): Unit = {
    val stack = new Stack[Fruit]
    val apple = new Apple
    val banana = new Banana

    stack.push(apple)
    stack.push(banana)

    val list: List[Fruit] = List[Fruit]()

  }
}

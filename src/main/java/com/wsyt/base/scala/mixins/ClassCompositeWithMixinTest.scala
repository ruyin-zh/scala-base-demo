package com.wsyt.base.scala.mixins

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description 当某个特质类被用于组合时,被称为混入
  *
  */
object ClassCompositeWithMixinTest extends App {

  abstract class A {
    val message: String
  }

  class B extends A {
    override val message: String = "I'm an instance of class B"
  }

  trait C extends A {
    def loudMessage = message.toUpperCase()
  }

  //类D有一个父类和一个混入C,一个类只能有一个父类但是可以有多个混入(分别使用extends和with),混入和某个父类可能有相同非父类
  class D extends B with C

  val d = new D
  println(d.message)
  println(d.loudMessage)

}

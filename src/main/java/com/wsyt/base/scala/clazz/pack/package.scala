package com.wsyt.base.scala.clazz

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 包对象
  * @description Scala提供包对象作为在整个包中方便的共享使用的容器;
  *              包对象中可以定义任何内容,而不仅仅是变量和方法--例如包对象经常用于保存包级作用域的类型别名和隐式转换,包对象甚至可以继承Scala的类和特质;
  *
  *              每个包都允许有一个包对象,在包对象中的任何定义都被认为是包自身的成员;
  */
//包对象和其他对象类似,这意味着可以使用继承来构建他们,如下所示继承于FruitAliases并实现特质FruitHelpers
package object pack extends FruitAliases with FruitHelpers {

  val planted = List(Apple,Plum,Banana)

  def showFruit(fruit: Fruit)={
    println(s"${fruit.name}s are ${fruit.color}")
  }

}

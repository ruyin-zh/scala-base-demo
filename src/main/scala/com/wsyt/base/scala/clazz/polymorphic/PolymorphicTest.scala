package com.wsyt.base.scala.clazz.polymorphic

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 多态方法
  * @description Scala中的方法可以按类型和值进行参数化,语法与泛型类似;
  *              类型参数括在方括号中,而值参数括在圆括号中;
  *
  */
object PolymorphicTest{

  def listOfDuplicate[A](x: A, length: Int): List[A] ={
    if (length < 1)
      Nil
    else
      //:: 操作表示将左侧的元素添加到右侧的列表中
      x :: listOfDuplicate(x,length - 1)
  }

  def main(args: Array[String]): Unit = {

    println(listOfDuplicate(2,4))
    println(listOfDuplicate("scala",3))

  }

}

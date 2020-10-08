package com.wsyt.base.scala.generic

/**
  *
  * @author ruyin_zh
  * @date 2020-09-27
  * @title
  * @description
  *
  */
class Stack[A] {

  private var elements:List[A] = Nil

  def push(x:A): Unit ={
    elements = x :: elements
  }

  def pop(): A ={
    val topEle: A = peak
    elements = elements.tail
    topEle
  }

  def peak: A = elements.head

}

object Stack{


  def main(args: Array[String]): Unit = {

    //实例对象stack只能接受整型值,如果参数类型有子类型,子类型可以被传入;
    //泛型的子类型是不可传导的,即一个Stack[Char]不可被用作Stack[Int],虽然Char会被转换成Int
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop())
    println(stack.pop())

  }

}

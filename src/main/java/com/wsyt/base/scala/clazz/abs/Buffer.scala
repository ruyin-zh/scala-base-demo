package com.wsyt.base.scala.clazz.abs

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 抽象类型
  * @description 特质和抽象类可以包含一个抽象类型成员,意味着实际类型可由具体实现来确定
  *
  */
trait Buffer {

  type T
  val element:T

}

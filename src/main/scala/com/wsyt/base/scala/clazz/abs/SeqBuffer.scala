package com.wsyt.base.scala.clazz.abs

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 抽象类型
  * @description Buffer定义的抽象类型T用来描述成员element的类型,通过抽象类来扩展这个特质后,就可以添加一个类型上边界来让抽象类型T变得更加具体
  *
  */
abstract class SeqBuffer extends Buffer {

  type U
  type T <: Seq[U]

  def length:Int = element.length

}

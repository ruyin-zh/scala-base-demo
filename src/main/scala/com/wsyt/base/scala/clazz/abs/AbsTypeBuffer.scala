package com.wsyt.base.scala.clazz.abs

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 抽象类型
  * @description 把抽象类型成员转成类的类型参数或者反过来也是可行的;
  *             需要注意的是在某些场景下使用类型参数替换抽象类型是行不通的;
  *
  */
abstract class AbsBuffer[+T] {

  val element:T

}

abstract class AbsSeqBuffer[U, T <: Seq[U]] extends AbsBuffer[T]{

  def length = element.length

}

object AbsIntSeqBuffer{

  def newIntSeqBuf(e1:Int, e2:Int)= new AbsSeqBuffer[Int,List[Int]] {
    val element = List(e1,e2)
  }

  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf(2,3)
    println(s"length = ${buf.length}")
    println(s"content = ${buf.element}")
  }
}



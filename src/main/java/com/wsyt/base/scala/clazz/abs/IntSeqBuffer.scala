package com.wsyt.base.scala.clazz.abs

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 抽象类型
  * @description
  *
  */
abstract class IntSeqBuffer extends SeqBuffer {

  type U = Int

}

object IntSeqBuffer{

  //工厂方法newIntSeqBuf使用了IntSeqBuffer的匿名实现方式,其类型T被设置为List[Int]
  def newIntSeqBuf(e1:Int, e2:Int) = new IntSeqBuffer {
    override type T = List[U]
    override val element = List(e1,e2)
  }

  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf(7,8)
    println(s"length = ${buf.length}")
    println(s"content = ${buf.element}")
  }
}

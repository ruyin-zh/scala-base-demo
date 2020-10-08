package com.wsyt.base.scala.mixins

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description 混入
  *
  */
object AbsIteratorTest extends App {

  abstract class AbsIterator {
      type T
      def hasNext:Boolean
      def next():T
  }

  //StringIterator带有一个String类型参数的构造器,可对字符串进行迭代
  class StringIterator(s: String) extends AbsIterator {
    override type T = Char
    private var i = 0;

    override def hasNext: Boolean = i < s.length

    override def next(): Char = {
      val ch = s charAt i
      i += 1
      ch
    }
  }

  //特质实现foreach方法--只要元素可以迭代(while(hasNext)),就会一直对下个元素(next())调用传入函数f:T => Unit
  trait RichIterator extends AbsIterator{
    def foreach(f: T => Unit):Unit = while (hasNext) f(next())
  }


  //结合StringIterator与RichIterator的功能
  class RichStringIter extends StringIterator("Scala") with RichIterator
  val richIter = new RichStringIter
  richIter foreach println

}

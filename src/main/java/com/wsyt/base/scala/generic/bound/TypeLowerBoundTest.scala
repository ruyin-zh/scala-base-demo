package com.wsyt.base.scala.generic.bound

/**
  *
  * @author ruyin_zh
  * @date 2020-09-28
  * @title
  * @description 类型下界
  *
  *   类型下界将类型声明为另一种类型的超类型,术语B>:A表示类型参数B或抽象类型B是类型A的超类型;
  *   在大多数情况下,A将是类的类型参数,而B将是方法的类型参数;
  *
  */
object TypeLowerBoundTest {

  def main(args: Array[String]): Unit = {

    val africaSwallowList = ListNode(AfricaSwallow(),Nil())
    val birdList = africaSwallowList
    birdList.prepend(EuropeanSwallow())
    birdList.productIterator.foreach(println)
  }


}


/**
  *
  * Node及其子类型是协变的,此处定义为+B
  *
  * */
trait Node[+B]{

  def prepend[U >: B](elem: U):Node[U]

}

/**
  *
  * 单链表节点,包含一个类型为B(head)的元素和一个队列表其余部分的引用(tail)
  *
  * */
case class ListNode[+B](h: B, t: Node[B]) extends Node[B]{

  override def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem,this)

  def head: B = h

  def tail: Node[B] = t

}

/**
  *
  * 空元素--空列表
  *
  * */
case class Nil[+B]() extends Node[B]{

  override def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem,this)

}



trait Bird
case class AfricaSwallow() extends Bird
case class EuropeanSwallow() extends Bird
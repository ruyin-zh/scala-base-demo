package com.wsyt.base.scala.clazz.implicitly

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 隐式参数
  * @description Scala将查找这些参数的位置分为两类:
  *              Scala在调用包含有隐式参数块的方法时,将首先查找可以直接访问的隐式定义和隐式参数;
  *              然后它在所有伴生对象中查找和隐式候选类型相关的隐式标记的成员;
  *
  */
abstract class Monoid[A]{
  def add(x:A,y:A):A
  def unit:A
}

object ImplicitTest {

  implicit val stringMonoid = new Monoid[String] {
    override def add(x: String, y: String): String = x concat y

    override def unit: String = ""
  }

  implicit val intMonoId = new Monoid[Int] {
    override def add(x: Int, y: Int): Int = x + y

    override def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A ={
    if (xs.isEmpty) m.unit
    else m.add(xs.head,sum(xs.tail))
  }


  def main(args: Array[String]): Unit = {
    println(sum(List(1,2,3)))
    println(sum(List("a","b","c")))
  }

}

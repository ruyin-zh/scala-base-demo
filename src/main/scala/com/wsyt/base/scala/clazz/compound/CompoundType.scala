package com.wsyt.base.scala.clazz.compound

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 复合类型
  * @description 有时需要表明一个对象的类型是其他几种类型的子类型,在Scala中可以表示成复合类型,即多个类型的交集;
  *
  */
trait Cloneable extends java.lang.Cloneable {

  override def clone(): Cloneable = super.clone().asInstanceOf[Cloneable]

}

trait Resetable {

  def reset:Unit

}

object CompoundType {

  //方法定义的时候可同时指定类型为Cloneable和Resetable,可避免强制转换,另外也可通过mixin来组合多个类成单独类型
  def cloneAndReset(obj: Cloneable with Resetable):Cloneable ={
    val cloned = obj.clone()
    obj.reset
    cloned
  }



}

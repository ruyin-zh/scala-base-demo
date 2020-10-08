package com.wsyt.base.scala.generic.variance

/**
  *
  * @author ruyin_zh
  * @date 2020-09-28
  * @title 泛型之不变
  * @description 不变--默认情况下,scala中泛型类是不变的,这意味着它们既不是协变也不是逆变的
  *
  */
object InvarianceTest {


  def main(args: Array[String]): Unit = {
    val catContainer: Container[Cat] = new Container[Cat](Cat("Felix"))

    val animalContainer = catContainer
    //编译器不通过
    //animalContainer.setValue(Dog("Jim"))
    val value: Cat = catContainer.getValue
  }


}


class Container[A](animal: A){
  private var _animal = animal

  def getValue = _animal

  def setValue(animal: A) = {
    _animal = animal
  }
}
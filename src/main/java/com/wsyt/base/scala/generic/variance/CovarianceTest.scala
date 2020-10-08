package com.wsyt.base.scala.generic.variance

/**
  *
  * @author ruyin_zh
  * @date 2020-09-28
  * @title 泛型之协变
  * @description 协变--使用注释+A,可以使一个泛型类的类型参数A成为协变
  *
  */
object CovarianceTest {

  def main(args: Array[String]): Unit = {

    val cats: List[Cat] = List(Cat("Tom"),Cat("Hanks"))
    val dogs: List[Dog] = List(Dog("Jim"),Dog("Jerry"))

    printAnimalNames(cats)
    printAnimalNames(dogs)
  }

  def printAnimalNames(animals: List[Animal]): Unit ={
    animals.foreach({animal => println(animal.name)})
  }

}



abstract class Animal{
  def name:String
}

case class Cat(name:String) extends Animal
case class Dog(name:String) extends Animal
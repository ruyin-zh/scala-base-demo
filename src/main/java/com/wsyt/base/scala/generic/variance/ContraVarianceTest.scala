package com.wsyt.base.scala.generic.variance

/**
  *
  * @author ruyin_zh
  * @date 2020-09-28
  * @title 泛型之逆变
  * @description 逆变--通过使用注释-A,可以使一个泛型类的类型参数A成为逆变;
  *                    与协变类似,这会在类机器类型参数之间创建一个子类型关系,但其作用于协变完全相反;
  *
  *
  */
object ContraVarianceTest {

  def main(args: Array[String]): Unit = {

    val cat: Cat = Cat("Tom")

    val catPrinter: CatPrinter = new CatPrinter
    val animalPrinter: AnimalPrinter = new AnimalPrinter

    printCat(catPrinter,cat)
    printCat(animalPrinter,cat)
  }


  def printCat(printer: Printer[Cat],cat: Cat)={
    printer.print(cat)
  }

}

/**
  *
  * 对于某个类class Writer[-A],使得A逆变意味着对于两种类型A和B,如果A是B的子类型,那么Writer[B]是Writer[A]的子类型;
  *
  * */
abstract class Printer[-A]{

  def print(value: A)

}

class AnimalPrinter extends Printer[Animal]{
  override def print(animal: Animal): Unit = {
    println(s"The animal's name is: ${animal.name}")
  }
}

/**
  *
  * 如果Printer[Cat]知道如何在控制台打印出任意Cat,并且Printer[Animal]知道如何在控制台打印出任意Animal,
  * 那么Printer[Animal]也应该知道如何打印出Cat;反之则不可行,因为Printer[Cat]并不知道如何在控制台打印出任意Animal,
  * 故在这种场景下应该使用Printer[Animal]代替Printer[Cat],而使Printer[Cat]逆变允许做到这点;
  *
  * */
class CatPrinter extends Printer[Cat]{
  override def print(animal: Cat): Unit = {
    println(s"The cat's name is: ${animal.name}")
  }
}

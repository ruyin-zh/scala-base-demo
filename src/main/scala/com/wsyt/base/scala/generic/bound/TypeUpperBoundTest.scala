package com.wsyt.base.scala.generic.bound

/**
  *
  * @author ruyin_zh
  * @date 2020-09-28
  * @title
  * @description 类型上界
  *
  */
object TypeUpperBoundTest {


  def main(args: Array[String]): Unit = {
    val dogContainer: PetContainer[Dog] = new PetContainer[Dog](new Dog)
    val catcontainer: PetContainer[Cat] = new PetContainer[Cat](new Cat)

    //编译器报错
    //Lion do not conform to class PetContainer's type parameter bounds [P <: Pet]
    //val lionContainer: PetContainer[Lion] = new PetContainer[Lion](new Lion)
  }

}


abstract class Animal

abstract class Pet extends Animal

class Cat extends Pet

class Dog extends Pet

class Lion extends Animal

class PetContainer[P <: Pet](p: P){
  def pet:P = p
}
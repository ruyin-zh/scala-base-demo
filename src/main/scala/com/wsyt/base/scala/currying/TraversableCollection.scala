package com.wsyt.base.scala.currying

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description
  *
  */
object TraversableCollection extends App {

  //TraversableOnce 定义foldLeft从左到右,以此将一个二元运算op应用到z和迭代器traversable的所有元素上
  //def foldLeft[B](z: B)(op: (B, A) => B): B


  val number = List(1,2,3,4,5,6,7,8,9,10)
  val res = number.foldLeft(0)((m,n) => m + n)
  //val res = number.foldLeft(0)(_ + _)
  //val res = number.sum
  //val res = number.foldLeft(0, {(m: Int,n: Int) => m + n})

  println(res)

  val numberFunc = number.foldLeft(List[Int]())_

  val squares = numberFunc((xs, x) => xs:+ x*x)
  println(squares.toString())

  val cubes = numberFunc((xs, x) => xs:+ x*x*x)
  println(cubes)


}

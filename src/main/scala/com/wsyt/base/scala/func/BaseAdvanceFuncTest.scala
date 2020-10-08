package com.wsyt.base.scala.func

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description
  *
  */
object BaseAdvanceFuncTest extends App {

  //Scala集合类的高阶函数map
  val salaries = Seq(20000,70000,40000)
  val doubleSalary = (x: Int) => x * 2
  val newSalaries = salaries.map(doubleSalary)

  println(salaries)
  println(doubleSalary)
  println(newSalaries)


  //可以直接使用匿名函数将其作为参数传递给map函数
  val newSalaries_1 = salaries.map(x => x * 2)
  println(newSalaries_1)

  //另外上述表达还可以使用更加简洁的写法
  val newSalaries_2 = salaries.map(_ * 2)
  println(newSalaries_2)
}

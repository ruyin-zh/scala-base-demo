package com.wsyt.base.scala.func;

/**
 * @author ruyin_zh
 * @date 2020-09-17
 * @title
 * @description 未使用高阶函数的SalaryRaiser
 */
object SalaryRaiser extends App {

  def smallPromotion(salaries: List[Double]): List[Double] = salaries.map(s => s * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] = salaries.map(s => s * math.log(s))

  def hugePromotion(salaries: List[Double]): List[Double] = salaries.map(s => math.pow(s,2))

  val salaries = List(23.4,24.5,25.6,26.7)
  println(smallPromotion(salaries))
  println(greatPromotion(salaries))
  println(hugePromotion(salaries))

}
